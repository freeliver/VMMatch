package com.vmloft.develop.library.im;

import android.content.Context;

import com.vmloft.develop.library.im.base.IMCallback;
import com.vmloft.develop.library.im.bean.IMContact;

/**
 * Create by lzan13 on 2019/5/23 09:47
 *
 * 定义 IM 全局回调接口
 */
public interface IMIGlobalListener {
    /**
     * 获取 IM 联系人对象
     *
     * @param id 联系人 id
     */
    void getIMContact(String id, IMCallback<IMContact> callback);

    /**
     * 联系人头像点击
     *
     * @param context 上下文对象
     * @param contact 点击的头像
     */
    void onHeadClick(Context context, IMContact contact);
}