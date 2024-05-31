package com.github.megatronking.svg.sample.extend;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.megatronking.svg.sample.R;
import com.github.megatronking.svg.support.extend.SVGView;


public class SVGViewRotationSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_view_rotation_sample);
        setTitle(getIntent().getStringExtra("title"));

        // set in code
        SVGView view1 = (SVGView) findViewById(R.id.extend_view1);
        view1.setSvgRotation(180);

        SVGView view2 = (SVGView) findViewById(R.id.extend_view2);
        view2.setSvgRotation(180);
        view2.setBackgroundResource(R.drawable.ic_android_red);
    }
}
