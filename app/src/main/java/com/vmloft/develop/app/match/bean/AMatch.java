package com.vmloft.develop.app.match.bean;

import android.os.Parcel;
import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

/**
 * Create by lzan13 on 2019/5/21 19:30
 *
 * 自定义匹配对象实体类
 */
@AVClassName("AMatch")
public class AMatch extends AVObject {

    /**
     * @return
     */
    public void setUser(AUser user) {
        put("user", user);
    }

    public AMatch() {}

    public AMatch(Parcel in) {
        super(in);
    }

    public static final Creator CREATOR = AVObjectCreator.instance;
}
