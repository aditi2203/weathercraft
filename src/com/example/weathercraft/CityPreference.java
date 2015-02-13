package com.example.weathercraft;

import android.app.Activity;
import android.content.SharedPreferences;
 
public class CityPreference {
     
    SharedPreferences prefs;
     
    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }
     
    // Default city is given
     String getCity(){
        return prefs.getString("city", "Hyderabad, IN");        
    }
     
    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
     
}