package com.sabar.SoccerScoresApp.data.league

import com.sabar.SoccerScoresApp.data.league.remote.LeagueApiInterface
import com.sabar.SoccerScoresApp.data.league.remote.response.DetailLeague
import io.reactivex.Observable

class LeagueRepository(private val services: LeagueApiInterface) :
    LeagueDataSource {
    override fun getDetailLeague(id : String): Observable<List<DetailLeague>> {
        return services.getDetailLeague(id).map { it.leagues }
    }
}