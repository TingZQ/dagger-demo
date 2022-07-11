package com.tingzq.dagger2.bean;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class GangJing {
    @Inject
    public GangJing() {
    }

    public void gang(Context context){
        Toast.makeText(context, "做一个有用的杠精", Toast.LENGTH_SHORT).show();
    }
}
