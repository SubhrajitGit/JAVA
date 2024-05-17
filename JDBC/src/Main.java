import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/college";
    private static final String user = "subhrajit";
    private static final String password = "Subhrajit2002@";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Load Driver
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM STUDENT";
            ResultSet result = statement.executeQuery(query);
            System.out.println("ID" + "\t" + "NAME" + "\t" + "EMAIL" + "MARKS");
            while (result.next()) {
                System.out.println(result.getInt("ID") + "\t" + result.getString("NAME") + "\t" + result.getString("EMAIL") + "\t" + result.getFloat("MARKS"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}