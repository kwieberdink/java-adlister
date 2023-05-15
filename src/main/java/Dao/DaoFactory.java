package Dao;

import Dao.Ads;

public class DaoFactory {
    private static Dao.Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}
