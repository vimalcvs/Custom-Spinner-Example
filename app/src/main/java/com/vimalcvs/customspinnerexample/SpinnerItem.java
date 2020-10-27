package com.vimalcvs.customspinnerexample;
/**
 *   VimalCVS - 29/10/2020
 **/
public class SpinnerItem {
    private String mCountryName;
    private int mFlagImage;

    public SpinnerItem(String countryName, int flagImage) {
        mCountryName = countryName;
        mFlagImage = flagImage;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public int getFlagImage() {
        return mFlagImage;
    }
}