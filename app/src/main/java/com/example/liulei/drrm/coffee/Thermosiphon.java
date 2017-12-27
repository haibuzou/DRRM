package com.example.liulei.drrm.coffee;

import javax.inject.Inject;

/**
 * Created by liulei on 2017/12/27.
 */

class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
