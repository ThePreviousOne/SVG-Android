package com.github.megatronking.svg.sample.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_sample_19 extends SVGRenderer {

    public ic_sample_19(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(48.0f);
        mHeight = dip2px(48.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 12.0f);
        mPath.rCubicTo(0.0f, -3.0f, 2.5f, -5.5f, 5.5f, -5.5f);
        mPath.cubicTo(20.5f, 6.5f, 23.0f, 9.0f, 23.0f, 12.0f);
        mPath.lineTo(12.0f, 12.0f);
        mPath.close();
        mPath.moveTo(12.0f, 12.0f);
        mPath.moveTo(12.0f, 12.0f);
        mPath.rCubicTo(0.0f, 3.0f, -2.5f, 5.5f, -5.5f, 5.5f);
        mPath.cubicTo(3.5f, 17.5f, 1.0f, 15.0f, 1.0f, 12.0f);
        mPath.rLineTo(11.0f, 0f);
        mPath.close();
        mPath.moveTo(12.0f, 12.0f);
        mPath.moveTo(12.0f, 12.0f);
        mPath.rCubicTo(-3.0f, 0.0f, -5.5f, -2.5f, -5.5f, -5.5f);
        mPath.cubicTo(6.5f, 3.5f, 9.0f, 1.0f, 12.0f, 1.0f);
        mPath.rLineTo(0f, 11.0f);
        mPath.close();
        mPath.moveTo(12.0f, 12.0f);
        mPath.moveTo(12.0f, 12.0f);
        mPath.rCubicTo(3.0f, 0.0f, 5.5f, 2.5f, 5.5f, 5.5f);
        mPath.cubicTo(17.5f, 20.5f, 15.0f, 23.0f, 12.0f, 23.0f);
        mPath.lineTo(12.0f, 12.0f);
        mPath.close();
        mPath.moveTo(12.0f, 12.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}