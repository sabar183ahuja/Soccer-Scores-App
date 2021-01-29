package com.sabar.SoccerScoresApp.base

import com.sabar.SoccerScoresApp.di.*
import org.koin.core.module.Module

class MainApplication : BaseApplication() {

    override fun getDefinedModules(): List<Module> {
        return listOf(
            dbModule,
            leagueModule,
            matchModule,
            standingModule,
            teamModule,
            matchFavoriteModule,
            teamFavoriteModule
        )
    }
}