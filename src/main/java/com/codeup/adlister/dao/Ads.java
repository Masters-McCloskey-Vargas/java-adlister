package com.codeup.adlister.dao;
import com.codeup.adlister.models.Ad;
import java.sql.SQLException;
import java.util.List;

public interface Ads {
    List<Ad> all();
    Long insert(Ad ad);
    List<Ad> searchAds(String userSearch) throws SQLException;
    List<Ad> userAds(long id);
    long searchAdId(long adId);
    long deleteAd(long adId);

}
