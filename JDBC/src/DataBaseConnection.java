import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class DataBaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String userName ="root";
    private static final String password ="admin";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            Statement statement = connection.createStatement();
//            String query = String.format("UPDATE students SET marks = %f WHERE id = %d",90.34,4);
            String query = ("DELETE FROM students WHERE id = 3");
            int rowAffected = statement.executeUpdate(query);
//            if(rowAffected>0){
//                System.out.println("Data Update successfully!");
//            }else {
//                System.out.println("Data not update");
//            }
            if(rowAffected>0){
                System.out.println("data delete successfully!!");
            }else {
                System.out.println("data not delete");
            }
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//
//                System.out.println("ID: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("age: "+age);
//                System.out.println("marks: "+marks);
//            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
