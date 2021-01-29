package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.AppDatabase
import com.sabar.SoccerScoresApp.data.matchfavorite.MatchFavoriteDataSource
import com.sabar.SoccerScoresApp.data.matchfavorite.MatchFavoriteRepository
import com.sabar.SoccerScoresApp.ui.favorite.match.MatchFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val matchFavoriteModule = module {

    single {
        val appDatabase: AppDatabase = get()
        return@single appDatabase.favoriteDao()
    }

    single<MatchFavoriteDataSource> { MatchFavoriteRepository(get()) }

    viewModel { MatchFavoriteViewModel(get()) }
}