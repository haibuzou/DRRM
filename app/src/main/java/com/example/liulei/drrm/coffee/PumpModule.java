package com.example.liulei.drrm.coffee;

import dagger.Binds;
import dagger.Module;

/**
 * Created by liulei on 2017/12/27.
 */

@Module
abstract class PumpModule {
    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
