package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.team.TeamDataSource
import com.sabar.SoccerScoresApp.data.team.TeamRepository
import com.sabar.SoccerScoresApp.data.team.remote.TeamApiInterface
import com.sabar.SoccerScoresApp.ui.team.TeamViewModel
import com.sabar.SoccerScoresApp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val teamModule = module {

    single<TeamApiInterface> { Network.builder().create() }

    single<TeamDataSource> { TeamRepository(get()) }

    viewModel { TeamViewModel(get()) }
}