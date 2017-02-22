package com.github.megatronking.svg.iconlibs;

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
public class ic_gif extends SVGRenderer {

    public ic_gif(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(11.5f, 9.0f);
        mPath.lineTo(13.0f, 9.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(-1.5f, 0f);
        mPath.close();
        mPath.moveTo(11.5f, 9.0f);
        mPath.moveTo(9.0f, 9.0f);
        mPath.lineTo(6.0f, 9.0f);
        mPath.rCubicTo(-0.6f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rCubicTo(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rCubicTo(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(8.5f, 12.0f);
        mPath.rLineTo(0f, 1.5f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -3.0f);
        mPath.lineTo(10.0f, 10.5f);
        mPath.lineTo(10.0f, 10.0f);
        mPath.rCubicTo(0.0f, -0.5f, -0.4f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(9.0f, 9.0f);
        mPath.rMoveTo(10.0f, 1.5f);
        mPath.lineTo(19.0f, 9.0f);
        mPath.rLineTo(-4.5f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.lineTo(16.0f, 15.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -1.5f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.close();
        mPath.moveTo(19.0f, 10.5f);
        
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