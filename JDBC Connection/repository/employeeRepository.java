package com.techatpark.practices.repository;

import com.techatpark.practices.model.Employee;
import org.springframework.data.repository.*;

import javax.sql.DataSource;
import java.util.Optional;

public class EmployeeRepository implements CrudRepository<Employee, Long> {

    private final DataSource dataSource;

    public EmployeeRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public <S extends Employee> S save(S entity) {
        if(entity.getId() == null) {
            S createdEmployee = null;
            String query = "INSERT INTO employee (\"name\", \"position\") VALUES (?, ?)";
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, entity.getName());
                preparedStatement.setString(2, entity.getPosition());
                preparedStatement.executeUpdate();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    long generatedId = resultSet.getLong(1);
                    System.out.println("New employee created");
                    createdEmployee = (S) findById(generatedId).get();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return createdEmployee;
        }
        else{
            S updatedEmployee = null;
            String query = "UPDATE Employee set \"name\" = ?, \"position\" = ? where id = ?";
            try (Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
                preparedStatement.setString(1, entity.getName());
                preparedStatement.setString(2, entity.getPosition());
                preparedStatement.setLong(3, entity.getId());
                if(preparedStatement.executeUpdate() == 1){
                    System.out.println("employee Details Updated");
                    updatedEmployee = (S) findById(entity.getId()).get();
                }
                else{
                    throw new IllegalArgumentException("Invalid Employee id");
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            return updatedEmployee;
        }
    }

    @Override
    public <S extends Employee> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long aLong) {
         String query = "SELECT id, name, position FROM employee WHERE id = ?";
        Employee employee = null;
        try(Connection connection = dataSource.getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(query);){
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                employee = new Employee();
                employee.setId(resultSet.getLong(1));
                employee.setName(resultSet.getString(2));
                employee.setPosition(resultSet.getString(3));
            }
       }
       catch (SQLException e){
           e.printStackTrace();
       }
        return Optional.ofNullable(employee);
    }

    @Override
    public Iterable<Employee> findAllById(Iterable<Long> ids) {

        List<Employee> employees = new ArrayList<>();

        ids.forEach(id -> findById(id).ifPresent(employees::add));

        return employees;
    }

    @Override
    public Iterable<Employee> findAll() {
         List<Employee> employees = new ArrayList<>();
        String query = "SELECT id, name, position FROM employee";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setId(resultSet.getLong(1));
                employee.setName(resultSet.getString(2));
                employee.setPosition(resultSet.getString(3));
                employees.add(employee);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public boolean existsById(Long id) {

        String query = "SELECT 1 FROM employee where id = ?";
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement =  connection.prepareStatement(query)){

            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            else {
                return false;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public long count() {
         String query = "SELECT COUNT(*) FROM employee";
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getLong(1);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        String query = "DELETE FROM employee WHERE id = ?";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);) {
             preparedStatement.setLong(1, id);
             if(preparedStatement.executeUpdate() == 1){
                 System.out.println("Employee id = " + id + " is deleted");
             }
             else{
                 throw new IllegalArgumentException("Invalid ID Cannot Deleted");
             }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Employee entity) {
        deleteById(entity.getId());
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        for(Long id : ids){
            deleteById(id);
        }
    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {
        for(Employee employee : entities){
            deleteById(employee.getId());
        }
    }

   @Override
    public void deleteAll() {
        String query = "DELETE From employee";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.executeUpdate();
            System.out.println("All Employee Table Data Was deleted");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
