package com.tscsoft.naroureader.utils;

import java.util.Locale;

public class ApiUtil {
    private static final String API_URL_BASE = "https://api.syosetu.com/%s/api/?out=json&of=n-t-w-%s-s-gl-nu-nt-e-k-ga-a&lim=%d";
    public static final String API_NOVEL18 = "novel18api";

    static String getApiBaseString(String str, int i) {
        boolean isR18 = API_NOVEL18.equals(str);
        String ofMiddle = isR18 ? "ng" : "u-g";
        return String.format(Locale.JAPAN, API_URL_BASE, str, ofMiddle, Integer.valueOf(i));
    }
}
