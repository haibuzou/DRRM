package com.example.liulei.drrm.coffee;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liulei on 2017/12/27.
 */

@Module(includes = PumpModule.class)
class DripCoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
