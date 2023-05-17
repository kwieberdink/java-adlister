package com.codeup.adlister.dao;
import Config.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Config Config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(Config);
        }
        return adsDao;
    }
}
