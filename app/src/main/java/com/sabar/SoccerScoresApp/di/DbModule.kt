package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.AppDatabase
import org.koin.dsl.module

val dbModule = module {

    single { AppDatabase.getAppDatabase(get()) }

}