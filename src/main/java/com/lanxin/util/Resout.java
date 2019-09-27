package com.lanxin.util;

import java.io.Serializable;

/**
 * Created by 曼珠沙华 on 2019/8/19.
 */
public class Resout implements Serializable{

    private int prop;//错误码

    private String msg;//显示子

    private Object object;//返回的对象



    public static Resout ok()//成功没有返回值得
    {
        Resout resout=new Resout();

        resout.setProp(200);
        resout.setMsg("操作成功");

        return resout;
    }

    public static Resout ok(Object obj)//成功后有返回值
    {
        Resout resout=new Resout();

        resout.setProp(200);
        resout.setMsg("操作成功");
        resout.setObject(obj);

        return resout;
    }

    public static Resout no()//失败后提示
    {
        Resout resout=new Resout();

        resout.setProp(500);
        resout.setMsg("系统内部出错");

        return resout;
    }




    public int getProp() {
        return prop;
    }

    public void setProp(int prop) {
        this.prop = prop;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
