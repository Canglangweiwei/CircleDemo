package com.yiw.circledemo.mvp.contract;

@SuppressWarnings("ALL")
public interface BaseView {
    void showLoading(String msg);

    void hideLoading();

    void showError(String errorMsg);
}
