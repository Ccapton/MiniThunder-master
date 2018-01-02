package com.capton.common;

import android.app.Activity;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

/**
 * Created by capton on 2017/12/14.
 */

public class OkGoUtil {

    public static void getNews(StringCallback stringCallback, Activity activity
    ,String channel,int start,int num){
        OkGo.<String>get(activity.getString(R.string.jisu_news_api))
                .tag(activity)
                .params("channel",channel)
                .params("start",start)
                .params("num",num)
                .params("appkey",activity.getString(R.string.jisu_appkey))
                .execute(stringCallback);
    }

}
