package com.tingzq.dagger2.bean;

import javax.inject.Inject;

public class SellMoe {

    @Inject

    public SellMoe(){

    }
    public String sellMoe(){
        return "卖了个大萌";
    }
}
