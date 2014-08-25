package com.kimo.lib.alexei;

import android.graphics.Bitmap;

/**
 * Created by Kimo on 8/18/14.
 */
public abstract class Calculus<T> implements Runnable {

    protected Bitmap mImage;
    protected long mElapsedTime = 0;
    protected T mResult;

    protected Calculus(Bitmap image) {
        mImage = image;
    }

    public Calculus() {}

    protected abstract T theCalculation(Bitmap image);

    @Override
    public void run() {
        
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        mResult = theCalculation(mImage);
        endTime = System.currentTimeMillis();

        mElapsedTime = endTime - startTime;
    }
}
