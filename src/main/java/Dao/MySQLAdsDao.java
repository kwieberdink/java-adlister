package Dao;

import Models.Ad;
import Config.Config.*;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private final Connection connection;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.Config.getUrl(),
                    Config.Config.getUser(),
                    Config.Config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//
//    @Override
//    public List<Ad> all() {
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery()
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
