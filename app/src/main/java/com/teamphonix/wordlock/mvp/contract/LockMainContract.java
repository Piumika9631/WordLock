package com.teamphonix.wordlock.mvp.contract;

import android.content.Context;

import com.teamphonix.wordlock.base.BasePresenter;
import com.teamphonix.wordlock.base.BaseView;
import com.teamphonix.wordlock.model.CommLockInfo;
import com.teamphonix.wordlock.mvp.p.LockMainPresenter;

import java.util.List;



public interface LockMainContract {
    interface View extends BaseView<Presenter> {

        void loadAppInfoSuccess(List<CommLockInfo> list);
    }

    interface Presenter extends BasePresenter {
        void loadAppInfo(Context context);

        void searchAppInfo(String search, LockMainPresenter.ISearchResultListener listener);

        void onDestroy();
    }
}
