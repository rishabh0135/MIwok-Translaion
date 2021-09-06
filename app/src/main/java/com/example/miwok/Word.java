package com.example.miwok;


public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourseId;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourseId;

    public Word(String defaultTranslation, String miwokTranslation,int ImageResourseId, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourseId = ImageResourseId;
        mAudioResourseId = audioResourseId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourseId = audioResourseId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourseId(){ return mImageResourseId; }

    public boolean hasImage(){
        return mImageResourseId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourseId(){ return mAudioResourseId; }

}