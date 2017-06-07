package sxmxlp.gmail.com.finalapp.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Lee on 2017/6/7.
 */

public class CoffeeMaker {
    @Inject
    Heater heater;

    public void brew() {
        heater.on();
        Log.d("CoffeeMaker", "is heating " + heater.isHeating);
        heater.off();
        Log.d("CoffeeMaker", "is heating " + heater.isHeating);
    }

    @Inject
    public CoffeeMaker() {

    }
}
