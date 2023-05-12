package dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    private static List<String> getAuthorNames() {
        List<String> authorNames = new ArrayList<>();
        try {
            // Searching for a Driver, and will find the mysql Driver located in pom.xml
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException sqlx) {
            sqlx.printStackTrace();
        }
        return authorNames;
    }

}
