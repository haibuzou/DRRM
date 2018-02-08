package com.example.liulei.drrm.component

import com.example.liulei.drrm.MainActivity
import com.example.liulei.drrm.module.MainModule
import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent{
    fun inject(mainActivity: MainActivity)
}