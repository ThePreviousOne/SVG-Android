package com.github.megatronking.svg.sample.extend;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.megatronking.svg.sample.R;
import com.github.megatronking.svg.support.extend.SVGImageButton;


public class SVGImageButtonAlphaSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_imagebutton_alpha_sample);
        setTitle(getIntent().getStringExtra("title"));

        // set in code
        SVGImageButton view1 = (SVGImageButton) findViewById(R.id.extend_imagebutton1);
        view1.setSvgAlpha(0.5f);

        SVGImageButton view2 = (SVGImageButton) findViewById(R.id.extend_imagebutton2);
        view2.setSvgAlpha(0.5f);
        view2.setImageResource(R.drawable.ic_android_red);
    }
}
