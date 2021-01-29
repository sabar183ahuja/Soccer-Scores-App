package com.sabar.SoccerScoresApp.data.match

import com.sabar.SoccerScoresApp.data.league.remote.response.DetailLeague
import com.sabar.SoccerScoresApp.data.match.remote.response.Match
import com.sabar.SoccerScoresApp.data.team.remote.response.Team
import io.reactivex.Observable

interface MatchDataSource {
    fun getMatchList(id : String): Observable<List<Match>>
    fun getDetailMatch(id : String): Observable<List<Match>>
    fun getDetailLeague(id : String): Observable<List<DetailLeague>>
    fun getTeamDetail(id : String): Observable<List<Team>>
    fun getSearchMatch(query : String): Observable<List<Match>>
}