package com.blankj.api

class Config {

    public static final String EXT_NAME = 'api'

    public static final List<String> EXCEPTS = [
            'com.android.support:',
            'com.android.support.constraint:',
            'android.arch.',
            'org.jetbrains.kotlin:',
            'org.jetbrains:',
            'com.squareup.'
    ]

    public static final String FILE_SEP = System.getProperty("file.separator")

    public static final String API_UTILS_CLASS = 'com.blankj.utilcode.util.ApiUtils'.replace('.', FILE_SEP) + '.class'
}
