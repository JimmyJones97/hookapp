package io.virtualapp.home;

import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.poisearch.PoiSearch.SearchBound;
import com.amap.api.services.poisearch.PoiSearch.Query;
import com.amap.api.services.poisearch.PoiSearch;
import com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.core.PoiItem;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.app.Activity;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.io.File;


class Result {
    double latitude;
    double longtitude;
    boolean enable;
    String citycode;
    public void setLatitude(double l) {
        latitude = l;
    }
    public void setLongitude(double l) {
        longtitude = l;
    }
    public void setEnable(boolean e) {
        enable = e;
    }
    public void setCityCode(String c) {
        citycode = c;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longtitude;
    }
    public boolean getEnable() {
        return enable;
    }
    public String getCityCode() {
        return citycode;
    }

    public Result() {
        super();
    }
}

public class LocationHook {

    /*public static Result getResult() {
        Result result = new Result();
        SharedPreferences sp = getSharedPreferences("locationHook");
        String latitude = sp.getString("lan", "");
        String longtitude = sp.getString("lon", "");
        String citycode = sp.getString("acc", "");

        //SharedPreferences xsp =new SharedPreferences("io.virtualapp.home","locationHook");
        //double latitude = Double.valueOf(xsp.getString("lan","36.681752"))+ (double) new Random().nextInt(1000) / 1000000  ;
        //double longtitude = Double.valueOf(xsp.getString("lon","117.536246"))+ (double) new Random().nextInt(1000) / 1000000  ;
        //boolean enable = xsp.getBoolean("enableHook", true);
        //String citycode = xsp.getString("acc","010");
        result.setLatitude(Double.parseDouble(latitude));
        result.setLongitude(Double.parseDouble(longtitude));
        //result.setEnable(enable);
        result.setCityCode(citycode);
        return result;
    }*/
}
