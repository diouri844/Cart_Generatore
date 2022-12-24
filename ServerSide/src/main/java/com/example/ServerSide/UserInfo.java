package com.example.ServerSide;
import java.util.*;


public class UserInfo {
    private String UserFirstName;
    private String UserArabicFName;
    private String UserLastName;
    private String UserArabicLName;
    private String UserCin;
    private String UserProfession;
    private int UserCardType; // A(1) or B(0)
    private String UserBirthDay;
    public UserInfo(Dictionary user_form_data){
        // initialize an user info
        UserFirstName = (String) user_form_data.get("FirstName");
        UserArabicFName = (String) user_form_data.get("ArFName");
        UserLastName = (String) user_form_data.get("LastName");
        UserArabicLName = (String) user_form_data.get("ArLName");
        UserCin = (String) user_form_data.get("Cin");
        UserProfession = (String) user_form_data.get("Profession");
        UserCardType = (int) user_form_data.get("Card");
        UserBirthDay = (String) user_form_data.get("Date");
    }
}
