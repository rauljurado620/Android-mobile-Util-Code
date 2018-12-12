package com.blankj.launcher.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.blankj.base.BaseApplication;
import com.blankj.subutil.pkg.helper.DialogHelper;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.BusUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.Utils;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/10/12
 *     desc  : app about utils
 * </pre>
 */
public class UtilsApp extends BaseApplication {

    private static UtilsApp sInstance;

    public static UtilsApp getInstance() {
        return sInstance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        AppUtils.registerAppStatusChangedListener(this, new Utils.OnAppStatusChangedListener() {
            @Override
            public void onForeground() {
//                Activity topActivity = ActivityUtils.getTopActivity();
//                if (topActivity == null) return;
//                ViewGroup decorView = (ViewGroup) topActivity.getWindow().getDecorView();
//                View blur = decorView.findViewWithTag("blur");
//                if (blur == null) return;
//                decorView.removeView(blur);

                LogUtils.i();
            }

            @Override
            public void onBackground() {


                LogUtils.i();
            }
        });
    }


    private Bitmap getBitmapForView(View src) {
        Bitmap bitmap = Bitmap.createBitmap(
                src.getWidth(),
                src.getHeight(),
                Bitmap.Config.ARGB_8888
        );

        Canvas canvas = new Canvas(bitmap);
        src.draw(canvas);

        return bitmap;
    }

    @BusUtils.Subscribe(name = "showDialog")
    public static void showDialog() {
        DialogHelper.showOpenAppSettingDialog();
    }
}


