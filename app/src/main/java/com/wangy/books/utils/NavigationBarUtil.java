package com.wangy.books.utils;


import android.content.Context;
import android.content.Intent;
import android.provider.Settings.System;
import android.view.Window;

public class NavigationBarUtil {
    public NavigationBarUtil() {
    }

    public static void hideNavigationBar(Window window) {
        if (isShowNavigationBar(window)) {
            hideSystemUI(window);
        }

    }

    public static void showNavigationBar(Window window) {
        if (!isShowNavigationBar(window)) {
            showSystemUI(window);
        }

    }

    public static boolean isShowNavigationBar(Window window) {
        return (window.getDecorView().getSystemUiVisibility() & 8192) <= 0;
    }

    public static void focusNotAle(Window window) {
        window.setFlags(8, 8);
    }

    public static void clearFocusNotAle(Window window) {
        window.clearFlags(8);
    }

    public static void hideSystemUI(Window window) {
        window.addFlags(1024);
        window.getDecorView().setSystemUiVisibility(12038);
    }

    public static void showSystemUI(Window window) {
        window.getDecorView().setSystemUiVisibility(256);
    }

    public static boolean mt8735GetNavigationBarState(Context context) {
        int status = System.getInt(context.getContentResolver(), "navigation_bar_switch", 0);
        return status != 0;
    }

    public static void mt8735ShowNavigationBar(Context context) {
        String action = "android.intent.action.NAVIGATION_BAR";
        Intent intent = new Intent();
        intent.setAction(action);
        intent.putExtra("enable", true);
        context.sendBroadcast(intent);
    }

    public static void mt8735HideNavigationBar(Context context) {
        String action = "android.intent.action.NAVIGATION_BAR";
        Intent intent = new Intent();
        intent.setAction(action);
        intent.putExtra("enable", false);
        context.sendBroadcast(intent);
    }
}

