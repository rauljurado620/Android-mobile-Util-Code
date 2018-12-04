package com.blankj.androidutilcode.feature.core;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.view.View;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;
import com.blankj.androidutilcode.feature.core.activity.ActivityActivity;
import com.blankj.androidutilcode.feature.core.app.AppActivity;
import com.blankj.androidutilcode.feature.core.bar.BarActivity;
import com.blankj.androidutilcode.feature.core.clean.CleanActivity;
import com.blankj.androidutilcode.feature.core.device.DeviceActivity;
import com.blankj.androidutilcode.feature.core.fragment.FragmentActivity;
import com.blankj.androidutilcode.feature.core.image.ImageActivity;
import com.blankj.androidutilcode.feature.core.keyboard.KeyboardActivity;
import com.blankj.androidutilcode.feature.core.log.LogActivity;
import com.blankj.androidutilcode.feature.core.metaData.MetaDataActivity;
import com.blankj.androidutilcode.feature.core.network.NetworkActivity;
import com.blankj.androidutilcode.feature.core.path.PathActivity;
import com.blankj.androidutilcode.feature.core.permission.PermissionActivity;
import com.blankj.androidutilcode.feature.core.phone.PhoneActivity;
import com.blankj.androidutilcode.feature.core.process.ProcessActivity;
import com.blankj.androidutilcode.feature.core.reflect.ReflectActivity;
import com.blankj.androidutilcode.feature.core.resource.ResourceActivity;
import com.blankj.androidutilcode.feature.core.sdcard.SDCardActivity;
import com.blankj.androidutilcode.feature.core.snackbar.SnackbarActivity;
import com.blankj.androidutilcode.feature.core.sp.SPActivity;
import com.blankj.androidutilcode.feature.core.span.SpanActivity;
import com.blankj.androidutilcode.feature.core.toast.ToastActivity;
import com.blankj.utilcode.util.BusUtils;
import com.blankj.utilcode.util.Utils;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2016/09/29
 *     desc  :
 * </pre>
 */
public class CoreUtilActivity extends BaseBackActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, CoreUtilActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_util_core;
    }

    @Override
    public void initView(Bundle savedInstanceState, View contentView) {
        Utils.getApp();
        getToolBar().setTitle(getString(R.string.core_util));
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }

    public void coreUtilClick(View view) {

    }

    public void activityClick(View view) {
        ActivityActivity.start(this);
    }

    public void adaptScreenClick(View view) {
        BusUtils.post("AdaptScreenActivity#start", this);
    }

    public void appClick(View view) {
        AppActivity.start(this);
    }

    public void barClick(View view) {
        BarActivity.start(this);
    }

    public void cleanClick(View view) {
        CleanActivity.start(this);
    }

    public void crashClick(View view) {
        throw new NullPointerException("crash test");
    }

    public void deviceClick(View view) {
        DeviceActivity.start(this);
    }

    public void fragmentClick(View view) {
        FragmentActivity.start(this);
    }

    public void imageClick(View view) {
        ImageActivity.start(this);
    }

    public void keyboardClick(View view) {
        KeyboardActivity.start(this);
    }

    public void logClick(View view) {
        LogActivity.start(this);
    }

    public void metaDataClick(View view) {
        MetaDataActivity.start(this);
    }

    public void networkClick(View view) {
        NetworkActivity.start(this);
    }

    public void pathClick(View view) {
        PathActivity.start(this);
    }

    public void permissionClick(View view) {
        PermissionActivity.start(this);
    }

    public void phoneClick(View view) {
        PhoneActivity.start(this);
    }

    public void processClick(View view) {
        ProcessActivity.start(this);
    }

    public void reflectClick(View view) {
        ReflectActivity.start(this);
    }

    public void resourceClick(View view) {
        ResourceActivity.start(this);
    }

    public void sdcardClick(View view) {
        SDCardActivity.start(this);
    }

    public void snackbarClick(View view) {
        SnackbarActivity.start(this);
    }

    public void spClick(View view) {
        SPActivity.start(this);
    }

    public void spannableClick(View view) {
        SpanActivity.start(this);
    }

    public void toastClick(View view) {
        ToastActivity.start(this);
    }

    public static float getAnimationScale(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return Settings.Global.getFloat(context.getContentResolver(),
                    Settings.Global.ANIMATOR_DURATION_SCALE, 1.0f);
        } else {
            return Settings.System.getFloat(context.getContentResolver(),
                    Settings.System.ANIMATOR_DURATION_SCALE, 1.0f);
        }
    }
}
