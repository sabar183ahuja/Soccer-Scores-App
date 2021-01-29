package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.league.LeagueDataSource
import com.sabar.SoccerScoresApp.data.league.LeagueRepository
import com.sabar.SoccerScoresApp.data.league.remote.LeagueApiInterface
import com.sabar.SoccerScoresApp.ui.league.LeagueViewModel
import com.sabar.SoccerScoresApp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val leagueModule = module {

    single<LeagueApiInterface> { Network.builder().create() }

    single<LeagueDataSource> { LeagueRepository(get()) }

    viewModel { LeagueViewModel(get()) }
}