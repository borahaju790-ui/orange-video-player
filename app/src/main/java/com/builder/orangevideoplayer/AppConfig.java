package com.builder.orangevideoplayer;

/** Settings chosen in App Builder. Change a value and rebuild to update the app. */
public final class AppConfig {
    private AppConfig() { }

    public static final String APP_NAME = "Orange Video Player";
    public static final String START_URL = "file:///android_asset/index.html";
    public static final String BRAND_COLOR = "#000000";

    public static final boolean FEATURE_DOWNLOADS = true;
    public static final boolean FEATURE_NOTIFICATIONS = true;
    public static final boolean FEATURE_SHARE = true;
    public static final boolean FEATURE_VIBRATION = true;
    public static final boolean FEATURE_FILE_UPLOAD = true;
    public static final boolean FEATURE_MEDIA_PERMISSIONS = true;
    public static final boolean FEATURE_OFFLINE_PAGE = true;
    public static final boolean FEATURE_SPLASH = true;

    public static final boolean OPEN_EXTERNAL_LINKS = true;
    public static final boolean BLOCK_LONG_PRESS = true;
}
