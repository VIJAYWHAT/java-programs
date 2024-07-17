import model.Employee;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.*;


public class HelloJdbc {
    public static void main(String[] args) throws SQLException {
        // Create DS
        DataSource dataSource = getDatasource();

        Employee employee = new Employee();
        employee.setName("Ram");
        employee.setPosition("QA");

        long recortInserted = CreatEmployee(dataSource, employee);
        System.out.println("Success Inserted " + recortInserted + " Records");

        employee = new Employee();

        employee.setName("Ramachandran");
        employee.setPosition("PHP Dev");

//        int resultupdate = UpdateEmployee(dataSource, employee);
//        System.out.println("Update Success " + resultupdate + " Rows");

        employee.setId(3L);
        Long idToDelete = employee.getId();

//        int deletedRecords = DeleteEmployee(dataSource, idToDelete);
//        System.out.println("Success Deleted " + deletedRecords + " Rows");

    }

    private static int DeleteEmployee(DataSource dataSource, Long idToDelete) throws SQLException {
        String query = "DELETE FROM employee WHERE id = ?";

        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setLong(1, idToDelete);
        return preparedStatement.executeUpdate();
    }

    private static int UpdateEmployee(DataSource dataSource, Employee employee) throws SQLException {
        String query = "UPDATE employee set \"name\" = ?, \"position\" = ? WHERE id = ?";

        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getPosition());
        preparedStatement.setLong(3, employee.getId());
        return preparedStatement.executeUpdate();
    }

    private static long CreatEmployee(DataSource dataSource, Employee employee) throws SQLException {
        String query = "INSERT INTO employee (\"name\", \"position\") VALUES (?, ?)";

        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getPosition());


        long recordInserted = preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();

        if(resultSet.next()){
            recordInserted = resultSet.getLong(1);
        }

        return recordInserted;

    }


    private static DataSource getDatasource() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUser("postgres");
        dataSource.setPassword("password");
        return dataSource;
    }
}
