import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.DB.Db;
import com.entity.userEntity;

public class CRUDcollection {
    private static Connection conn;
    private static Statement statement;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static void add(userEntity user) throws SQLException {
        conn = Db.createConnection();
        String query = "insert into user (id,name,email,mobile) values (?,?,?,?);";
        preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getMobile());

        int affectedRows = preparedStatement.executeUpdate();
        if (affectedRows != 0) {
            System.out.println("User Data Inserted Sucessfully");
        } else {
            System.out.println("User Data Insertion Failed");
        }
    }

    public static List<userEntity> getaAll() throws SQLException {
        List<userEntity> list = new ArrayList<>();
        conn = Db.createConnection();
        String query = "select * from user";
        statement = conn.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            userEntity user = new userEntity(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"), resultSet.getString("mobile"));
            list.add(user);
        }
        return list;
    }

    public static void deleteUser(int id) throws SQLException {
        conn = Db.createConnection();
        String query = "delete from user where id=?";
        preparedStatement = conn.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int rowAffected = preparedStatement.executeUpdate();
        if (rowAffected != 0) {
            System.out.println("User Deleted SucessFully");
        } else {
            System.out.println("Deletion Failed");
        }

    }

    public static void updateUser(int id, userEntity updateUser) throws SQLException {
        conn = Db.createConnection();
        String query = "update user set name=?,email=?, mobile=? where id=?";
        preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, updateUser.getName());
        preparedStatement.setString(2, updateUser.getEmail());
        preparedStatement.setString(3, updateUser.getMobile());
        preparedStatement.setInt(4, id);
        int rowAffects = preparedStatement.executeUpdate();
        if (rowAffects != 0) {
            System.out.println("User Data Update SucessFully");
        } else {
            System.out.println("Update Operation Failed");
        }
    }

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        userEntity user = new userEntity(2, "Suvendu", "suvendu06@gmail.com", "9348051342");
//        CRUDcollection.add(user);
        List<userEntity> userList = CRUDcollection.getaAll();
        for (userEntity u : userList) {
            System.out.println(u);
        }
        //User Delete
//        System.out.print("Entere Id To Delete");
//        int id = sc.nextInt();
//        CRUDcollection.deleteUser(id);

        //Update User
//        userEntity updateUser = new userEntity(2,"Subhrajit","likundash42@gmail.com","9348051341");
//            CRUDcollection.updateUser(2,updateUser);
    }
}
