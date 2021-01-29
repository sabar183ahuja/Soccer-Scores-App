package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.teamfavorite.TeamFavoriteDataSource
import com.sabar.SoccerScoresApp.data.teamfavorite.TeamFavoriteRepository
import com.sabar.SoccerScoresApp.ui.favorite.team.TeamFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val teamFavoriteModule = module {

    single<TeamFavoriteDataSource> { TeamFavoriteRepository(get()) }

    viewModel { TeamFavoriteViewModel(get()) }
}