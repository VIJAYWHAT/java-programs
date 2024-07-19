package practices;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import practices.model.Employee;

public class getEmployee {
     public static void main(String[] args) throws SQLException {
        // Create DS
        DataSource dataSource = getDatasource();

        Employee employee = new Employee();
        employee.setName("Venkad");
        employee.setPosition("QA");


        Employee employees = getEmployee(dataSource, 1L);
        System.out.println(employees);

    }

    private static DataSource getDatasource() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDatasource'");
    }

    private static Employee getEmployee(DataSource dataSource, Long id) throws SQLException {
        Connection connection = dataSource.getConnection();
        Employee employee = new Employee();

        String query = "SELECT id, name, position from employee WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setLong(1,id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            getFromResultSet(employee, resultSet);
        }
        return employee;
    }


    private static List<Employee> getEmployees(DataSource dataSource) throws SQLException {
        Connection connection = dataSource.getConnection();

        String query = "SELECT id, name, position from employee";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();
        List<Employee> employees = new ArrayList<>();

        while(resultSet.next()){
            Employee employee = new Employee();
            getFromResultSet(employee, resultSet);

            employees.add(employee);
        }
        return employees;
    }

    private static void getFromResultSet(Employee employee, ResultSet resultSet) throws SQLException {
        employee.setId(resultSet.getLong(1));
        employee.setName(resultSet.getString(2));
        employee.setPosition(resultSet.getString(3));
    }
}
