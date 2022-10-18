import Package1.*;
import java.sql.*;

@SuppressWarnings("ALL")
public class Project1 {
    private static String _pass_phrase;
    private static int _name;

    public static void main(String[] args) {
        new username();
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "A9c2@1902");
            String query = "Select uname, pwd from student where uname= " + username.uname;
            statement = connection.prepareStatement(query);
            statement.setString(1,"uname");
            statement.setString(2,"pwd");
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                _name = resultSet.getInt(1);
                _pass_phrase = resultSet.getString(2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (_name != username.uname) {
            System.out.println("The username you entered is incorrect, Try again!");
            new username();
        } else {
            new pwd();
            if (!_pass_phrase.equals(pwd.password)) {
                System.out.println("The password you enter is incorrect, Try again!");
                new pwd();
            } else {
                new home();
            }
        }
    }

}
