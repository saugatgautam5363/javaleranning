import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String userName = "root";
    private static final String password = "admin";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            String query = "UPDATE students SET marks = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble( 1,99.9);
            preparedStatement.setInt(2,1);
            int row = preparedStatement.executeUpdate();
            if(row>0){
                System.out.println("Values is updated!!");
            }else {
                System.out.println("Values cannot updated!!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
