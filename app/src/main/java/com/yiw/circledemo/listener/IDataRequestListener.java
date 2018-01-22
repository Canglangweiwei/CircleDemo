package com.yiw.circledemo.listener;

/**
 * @author yiw
 * @ClassName: IDataRequestListener
 * @Description: 请求后台数据服务器响应后的回调
 * @date 2015-12-28 下午4:01:57
 */
@SuppressWarnings("ALL")
public interface IDataRequestListener {
    void loadSuccess(Object object);
}
