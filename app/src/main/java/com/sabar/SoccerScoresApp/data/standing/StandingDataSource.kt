package com.sabar.SoccerScoresApp.data.standing

import com.sabar.SoccerScoresApp.data.standing.remote.response.Standing
import io.reactivex.Observable

interface StandingDataSource {
    fun getStanding(id : String): Observable<List<Standing>>
}