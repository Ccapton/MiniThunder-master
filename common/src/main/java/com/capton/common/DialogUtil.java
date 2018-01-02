package com.capton.common;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by capton on 2018/1/1.
 */

public class DialogUtil {
    public static AlertDialog showNormalDialog(Context context,String content,String title,DialogInterface.OnClickListener onClickListener){
         AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(content);
        builder.setTitle(title);
        builder.setNegativeButton("取消",null);
        builder.setPositiveButton("确认", onClickListener);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        return alertDialog;
    }
    public static AlertDialog showMessageDialog(Context context,String content,DialogInterface.OnClickListener onClickListener){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(content);
        builder.setNegativeButton("取消",null);
        builder.setPositiveButton("确认", onClickListener);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        return alertDialog;
    }
    public static AlertDialog showTitleDialog(Context context,String title,DialogInterface.OnClickListener onClickListener){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setNegativeButton("取消",null);
        builder.setPositiveButton("确认", onClickListener);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        return alertDialog;
    }
    public static AlertDialog showCustomDialog(Context context,
                                               View view ,
                                               int backgroundResId,
                                               int width,
                                               boolean cancleOutsideAble){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(view);
        AlertDialog alertDialog = builder.create();



        alertDialog.setView(view);
        alertDialog.setCanceledOnTouchOutside(cancleOutsideAble);
        alertDialog.show();

        Window window = alertDialog.getWindow();
        if ( window != null ) {
            window.setBackgroundDrawableResource(backgroundResId);
            WindowManager.LayoutParams params =

                    window.getAttributes();

            params.width = width;

            params.height = width;

            window.setAttributes(params);
        }

        return alertDialog;
    }
}
