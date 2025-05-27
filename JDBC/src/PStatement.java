import java.sql.*;

public class PStatement {
    private static final String url ="jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password ="admin";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {

        Connection connection = DriverManager.getConnection(url,username,password);
//        String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            String query = "SELECT marks FROM students WHERE id = ?";
//            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,2);
//            preparedStatement.setString(1,"Sandesh b.k");
//            preparedStatement.setInt(2,20);
//            preparedStatement.setDouble(3,98.34);
//            int row = preparedStatement.executeUpdate();
//            if(row>0){
//                System.out.println("Data Insert Successfully");
//            }else {
//                System.out.println("Data not Inserted");
//            }
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                double marks = resultSet.getDouble("marks");
                System.out.println("Marks: "+marks);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
