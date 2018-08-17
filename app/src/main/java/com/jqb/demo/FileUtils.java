package com.jqb.demo;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils {

    public static String getFileName(String url) {
        String suffixes = "avi|mpeg|3gp|mp3|mp4|wav|jpeg|gif|jpg|png|apk|exe|pdf|rar|zip|docx|doc";
        Pattern pat = Pattern.compile("[\\w]+[\\.](" + suffixes + ")");//正则判断
        Matcher mc = pat.matcher(url);//条件匹配
        String fileName = "";
        while (mc.find()) {
            fileName = mc.group();//截取文件名后缀名
            Log.e("fileName:", fileName);
        }
        return fileName;
    }
}
