package com.github.megatronking.svg.sample.graphics;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.megatronking.svg.sample.R;


public class ScaleTypeSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics_scaletype_sample);
        setTitle(getIntent().getStringExtra("title"));
    }
}
