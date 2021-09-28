package com.teamphonix.wordlock.mvp.contract;

import android.content.Context;

import com.teamphonix.wordlock.base.BasePresenter;
import com.teamphonix.wordlock.base.BaseView;
import com.teamphonix.wordlock.model.CommLockInfo;

import java.util.List;



public interface MainContract {
    interface View extends BaseView<Presenter> {
        void loadAppInfoSuccess(List<CommLockInfo> list);
    }

    interface Presenter extends BasePresenter {
        void loadAppInfo(Context context, boolean isSort);

        void loadLockAppInfo(Context context);

        void onDestroy();
    }
}
