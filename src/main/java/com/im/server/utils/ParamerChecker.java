package com.im.server.utils;

import com.google.common.base.Strings;

/**
 * Created by majun on 16/1/20.
 */
public class ParamerChecker {

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNullOrEmpty(String str) {
        return Strings.isNullOrEmpty(str);
    }
}
