package com.yiw.circledemo.mvp.modle;

import android.os.AsyncTask;

import com.yiw.circledemo.listener.IDataRequestListener;

/**
 * @author yiw
 * @ClassName: CircleModel
 * @Description: 因为逻辑简单，这里我就不写model的接口了
 * @date 2015-12-28 下午3:54:55
 */
@SuppressWarnings("ALL")
public class CircleModel {

    public CircleModel() {
        super();
    }

    public void loadData(final IDataRequestListener listener) {
        requestServer(listener);
    }

    public void deleteCircle(final IDataRequestListener listener) {
        requestServer(listener);
    }

    public void addFavort(final IDataRequestListener listener) {
        requestServer(listener);
    }

    public void deleteFavort(final IDataRequestListener listener) {
        requestServer(listener);
    }

    public void addComment(final IDataRequestListener listener) {
        requestServer(listener);
    }

    public void deleteComment(final IDataRequestListener listener) {
        requestServer(listener);
    }

    /**
     * @param listener 设定文件
     * @Description: 与后台交互, 因为demo是本地数据，不做处理
     */
    private void requestServer(final IDataRequestListener listener) {

        new AsyncTask<Object, Integer, Object>() {

            @Override
            protected Object doInBackground(Object... params) {
                //和后台交互
                return null;
            }

            protected void onPostExecute(Object result) {
                listener.loadSuccess(result);
            }
        }.execute();
    }
}
