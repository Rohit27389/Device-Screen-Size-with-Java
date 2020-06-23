package com.rohit.device_layout_javacode;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

/**
 * Created by Rohit Kumar on 23-06-2020.
 */

public class ScreenUtility {

    public float dbheight;
    public float dbwidth;

    public ScreenUtility(Activity activity){
        Display display=activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics=new DisplayMetrics();

        display.getMetrics(outMetrics);
        float density=activity.getResources().getDisplayMetrics().density;

        dbheight=outMetrics.heightPixels/density;
        dbwidth=outMetrics.widthPixels/density;

    }
    public float getDbheight(){
        return dbheight;
    }
    public float getDbwidth(){
        return dbwidth;
    }
}
