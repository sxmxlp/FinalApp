package sxmxlp.gmail.com.finalapp.dagger;

import dagger.Component;

/**
 * Created by Lee on 2017/6/7.
 */
@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    CoffeeMaker maker();
}
