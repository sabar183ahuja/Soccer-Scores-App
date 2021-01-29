package com.sabar.SoccerScoresApp.data.team

import com.sabar.SoccerScoresApp.data.team.remote.TeamApiInterface
import com.sabar.SoccerScoresApp.data.team.remote.response.Team
import io.reactivex.Observable

class TeamRepository(private val services: TeamApiInterface) :
    TeamDataSource {
    override fun getTeamList(id : String): Observable<List<Team>> {
        return services.getTeamList(id).map { it.teams }
    }

    override fun getTeamDetail(id: String): Observable<List<Team>> {
        return services.getTeamDetail(id).map { it.teams }
    }

    override fun getSearchTeam(query: String): Observable<List<Team>> {
        return services.getSearchTeam(query).map { it.teams }
    }
}