package com.example.demo.common.utils;

import java.util.UUID;

public class UUIDUtil {
    /**
     * 获取一个UUID
     * @return
     */
    public static String getOneUUID(){
        String s= UUID.randomUUID().toString();
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }

    /**
     * 获取指定数目的UUID
     * @param number int 需要获得的UUID的数目
     * @return String[] UUID数组
     */
    public static String[] getUUID(int number){
        if(number<1){
            return null;
        }
        String[] ss=new String[number];
        for(int i=0;i<number;i++){
            ss[i]=getOneUUID();
        }
        return ss;
    }

}
