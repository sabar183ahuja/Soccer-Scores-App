package com.sabar.SoccerScoresApp.base

import com.sabar.SoccerScoresApp.data.league.remote.response.DetailLeague
import com.sabar.SoccerScoresApp.data.match.remote.response.Match
import com.sabar.SoccerScoresApp.data.standing.remote.response.Standing
import com.sabar.SoccerScoresApp.data.team.remote.response.Team
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("leagues")
    @Expose
    val leagues: List<DetailLeague>,

    @SerializedName("events")
    @Expose
    val events: List<Match>,

    @SerializedName("event")
    @Expose
    val event: List<Match>,

    @SerializedName("teams")
    @Expose
    val teams: List<Team>,

    @SerializedName("table")
    @Expose
    val table: List<Standing>
)