package com.sabar.SoccerScoresApp.data.league

import com.sabar.SoccerScoresApp.data.league.remote.response.DetailLeague
import io.reactivex.Observable

interface LeagueDataSource {
    fun getDetailLeague(id : String): Observable<List<DetailLeague>>
}