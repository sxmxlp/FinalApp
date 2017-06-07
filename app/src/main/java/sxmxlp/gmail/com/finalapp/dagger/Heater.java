package sxmxlp.gmail.com.finalapp.dagger;

import javax.inject.Inject;

/**
 * Created by Lee on 2017/6/7.
 */

class Heater {
    boolean isHeating;
    void on() {
       this.isHeating = true;
    }

    void off() {
       this.isHeating = false;
    }

    boolean isHeating() {
        return isHeating;
    }
}
