package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId, int imageResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
        this.mImageResourceId = imageResourceId;

    }

    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    public int getAudioResourceId(){ return mAudioResourceId; }

    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED; }

}
