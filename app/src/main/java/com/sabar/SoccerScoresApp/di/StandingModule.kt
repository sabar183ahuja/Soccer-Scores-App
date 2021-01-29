package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.standing.StandingDataSource
import com.sabar.SoccerScoresApp.data.standing.StandingRepository
import com.sabar.SoccerScoresApp.data.standing.remote.StandingApiInterface
import com.sabar.SoccerScoresApp.ui.standing.StandingViewModel
import com.sabar.SoccerScoresApp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val standingModule = module {

    single<StandingApiInterface> { Network.builder().create() }

    single<StandingDataSource> { StandingRepository(get()) }

    viewModel { StandingViewModel(get()) }
}