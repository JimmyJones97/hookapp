package lab.galaxy.locationHook;

import android.content.SharedPreferences;
import android.util.Log;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.content.Context.CONTEXT_INCLUDE_CODE;
//import android.content.Context.createPackageContext;


/**
 * Created by liuruikai756 on 17/05/2017.
 */

public class Hook_Location_getLatitude {
    public static String className = "com.amap.api.location.AMapLocation";
    public static String methodName = "getLatitude";
    public static String methodSig = "()D";
    Context packageContext = createPackageContext("io.virtualapp.home.location",CONTEXT_INCLUDE_CODE|Context.CONTEXT_IGNORE_SECURITY);
    public static double hook(Object thiz) {
        //根据包名获取另一个应用的Context对象
        Context packageContext = getApplicationContext().createPackageContext("io.virtualapp.home.location",CONTEXT_INCLUDE_CODE|Context.CONTEXT_IGNORE_SECURITY);
        SharedPreferences hook_value = packageContext.getSharedPreferences("locationHook", MODE_WORLD_READABLE);
        double latitude = hook_value.getString("lan", "");
        Log.i("YAHFA", "Location getLatitude hooked");
        return 39.512969;
    }
}
