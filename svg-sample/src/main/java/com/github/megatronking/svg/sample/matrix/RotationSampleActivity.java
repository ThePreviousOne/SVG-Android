package com.github.megatronking.svg.sample.matrix;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.megatronking.svg.sample.R;


public class RotationSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_rotation_sample);
        setTitle(getIntent().getStringExtra("title"));
    }
}
