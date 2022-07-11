package com.tingzq.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tingzq.dagger2.bean.GangJing;
import com.tingzq.dagger2.bean.SellMoe;
import com.tingzq.dagger2.component.DaggerMainAcComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    SellMoe sellMoe;

    @Inject
    GangJing gangJing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.main_tv_msg);
        DaggerMainAcComponent.create().inject(this);
        textView.setText(sellMoe.sellMoe());
        gangJing.gang(this);
    }
}