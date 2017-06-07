package sxmxlp.gmail.com.finalapp.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lee on 2017/6/7.
 */

@Module
public class CoffeeModule {
    @Provides
    static Heater provideHeater() {
        return new Heater();
    }
}
