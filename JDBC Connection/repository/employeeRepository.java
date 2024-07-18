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

    @Override
    public <S extends Employee> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Employee> findAll() {
        return null;
    }

    @Override
    public Iterable<Employee> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Employee entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
