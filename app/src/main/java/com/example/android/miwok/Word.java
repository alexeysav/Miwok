package com.example.android.miwok;

import android.content.Context;
import android.widget.TextView;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private int mSoundResourceID;
    private int mTextColor;
    private Context mContext;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mSoundResourceID = soundResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceID = soundResourceID;
    }

    public String getDeafaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getSoundResourceID() { return mSoundResourceID; }

    public Context getmContext() {
        return mContext;
    }
}
