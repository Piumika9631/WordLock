package com.teamphonix.wordlock.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.teamphonix.wordlock.base.AppConstants;
import com.teamphonix.wordlock.services.BackgroundManager;
import com.teamphonix.wordlock.services.LoadAppListService;
import com.teamphonix.wordlock.services.LockService;
import com.teamphonix.wordlock.utils.LogUtil;
import com.teamphonix.wordlock.utils.SpUtil;


public class BootBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(@NonNull Context context, Intent intent) {
        LogUtil.i("Boot service....");
        //TODO: pie compatable done
       // context.startService(new Intent(context, LoadAppListService.class));
        BackgroundManager.getInstance().init(context).startService(LoadAppListService.class);
        if (SpUtil.getInstance().getBoolean(AppConstants.LOCK_STATE, false)) {
            BackgroundManager.getInstance().init(context).startService(LockService.class);
            BackgroundManager.getInstance().init(context).startAlarmManager();
        }
    }
}
