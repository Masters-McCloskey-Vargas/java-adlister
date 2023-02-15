//package com.codeup.adlister.dao;
//
//import com.codeup.adlister.models.Ad;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListAdsDao {
//    private List<Ad> ads;
//
//    public List<Ad> all() {
//        if (ads == null) {
//            ads = generateAds();
//        }
//        return ads;
//    }
//
//    public Long insert(Ad ad) {
//        // make sure we have ads
//        if (ads == null) {
//            ads = generateAds();
//        }
//        // we'll assign an "id" here based on the size of the ads list
//        // really the dao would handle this
//        ad.setId((long) ads.size());
//        ads.add(ad);
//        return ad.getId();
//    }
//
//    private List<Ad> generateAds() {
//        List<Ad> ads = new ArrayList<>();
//        ads.add(new Ad(
//                1,
//                "playstation for sale",
//                "Joe Shmoe",
//                "This is a slightly used playstation",
//                100
//        ));
//        ads.add(new Ad(
//                1,
//                "Super Nintendo",
//                "John Doe",
//                "Get your game on with this old-school classic!",
//                100
//        ));
//        ads.add(new Ad(
//                2,
//                "Junior Java Developer Position",
//                "Fred Flintstone",
//                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript",
//                100
//        ));
//        ads.add(new Ad(
//                2,
//                "JavaScript Developer needed",
//                "Sam Sneed",
//                "Must have strong Java skills",
//                100
//        ));
//        return ads;
//    }
//}
