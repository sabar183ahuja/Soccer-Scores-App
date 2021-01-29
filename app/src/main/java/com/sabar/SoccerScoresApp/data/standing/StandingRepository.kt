package com.sabar.SoccerScoresApp.data.standing

import com.sabar.SoccerScoresApp.data.standing.remote.StandingApiInterface
import com.sabar.SoccerScoresApp.data.standing.remote.response.Standing
import io.reactivex.Observable

class StandingRepository(private val services: StandingApiInterface) : StandingDataSource {
    override fun getStanding(id: String): Observable<List<Standing>> {
        return services.getStanding(id).map { it.table }
    }
}