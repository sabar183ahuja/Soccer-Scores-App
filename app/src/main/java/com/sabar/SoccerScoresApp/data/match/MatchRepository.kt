package com.sabar.SoccerScoresApp.data.match

import com.sabar.SoccerScoresApp.data.league.remote.response.DetailLeague
import com.sabar.SoccerScoresApp.data.match.remote.MatchApiInterface
import com.sabar.SoccerScoresApp.data.match.remote.response.Match
import com.sabar.SoccerScoresApp.data.team.remote.response.Team
import io.reactivex.Observable

class MatchRepository(private val services: MatchApiInterface) :
    MatchDataSource {
    override fun getMatchList(id : String): Observable<List<Match>> {
        return services.getMatchList(id).map { it.events }
    }

    override fun getDetailMatch(id: String): Observable<List<Match>> {
        return services.getDetailMatch(id).map { it.events }
    }

    override fun getDetailLeague(id : String): Observable<List<DetailLeague>> {
        return services.getDetailLeague(id).map { it.leagues }
    }

    override fun getTeamDetail(id: String): Observable<List<Team>> {
        return services.getTeamDetail(id).map { it.teams }
    }

    override fun getSearchMatch(query: String): Observable<List<Match>> {
        return services.getSearchMatch(query).map { it.event }
    }
}