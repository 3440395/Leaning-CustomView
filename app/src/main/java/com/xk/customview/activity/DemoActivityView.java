package com.xk.customview.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xk.customview.R;

/**
 * Created by xuekai on 2017/2/20.
 */

public class DemoActivityView extends ViewBaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }
}
