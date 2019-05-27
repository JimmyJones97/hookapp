package lab.galaxy.locationHook;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 */

public class Hook_Location_getCityCode {
    public static String className = "com.amap.api.location.AMapLocation";
    public static String methodName = "getCityCode";
    public static String methodSig = "()Ljava/lang/String";
    public static String hook(Object thiz) {
        Log.i("YAHFA", "Location getCityCode hooked");
        return "0316";
    }
}
