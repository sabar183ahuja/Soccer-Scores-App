package com.sabar.SoccerScoresApp.di

import com.sabar.SoccerScoresApp.data.match.MatchDataSource
import com.sabar.SoccerScoresApp.data.match.MatchRepository
import com.sabar.SoccerScoresApp.data.match.remote.MatchApiInterface
import com.sabar.SoccerScoresApp.ui.match.MatchViewModel
import com.sabar.SoccerScoresApp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val matchModule = module {

    single<MatchApiInterface> { Network.builder().create() }

    single<MatchDataSource> { MatchRepository(get()) }

    viewModel { MatchViewModel(get()) }
}