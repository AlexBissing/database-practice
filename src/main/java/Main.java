import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root_user";


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {
            statement.executeUpdate("UPDATE users SET email = 'stevemail@mail.ru' WHERE id = 8");
            statement.executeUpdate("UPDATE users SET email = 'pamelamail@mail.ru' WHERE id = 9");
            statement.executeUpdate("UPDATE users SET email = 'sasandramail@mail.ru' WHERE id = 10");
            statement.executeUpdate("UPDATE users SET email = 'tanyaemail@mail.ru' WHERE id = 11");

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
