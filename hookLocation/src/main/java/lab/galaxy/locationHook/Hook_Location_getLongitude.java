package lab.galaxy.locationHook;

import android.util.Log;

/**
 * Created by liuruikai756 on 17/05/2017.
 */

public class Hook_Location_getLongitude {
    public static String className = "com.amap.api.location.AMapLocation";
    public static String methodName = "getLongitude";
    public static String methodSig = "()D";
    public static double hook(Object thiz) {
        Log.i("YAHFA", "Location getLongitude hooked");
        return 116.705688;
    }
}
