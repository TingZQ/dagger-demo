package com.tingzq.dagger2.component;


import com.tingzq.dagger2.MainActivity;

import dagger.Component;

@Component
public interface MainAcComponent {

    void inject(MainActivity mainActivity);
}
