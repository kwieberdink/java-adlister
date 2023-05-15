package Dao;

import Models.Ad;

import java.sql.Connection;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private final Connection connection;

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
