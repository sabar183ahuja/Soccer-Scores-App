package com.sabar.SoccerScoresApp.data.matchfavorite

import com.sabar.SoccerScoresApp.data.matchfavorite.local.response.MatchFavorite
import io.reactivex.Completable
import io.reactivex.Single

interface MatchFavoriteDataSource {
    fun addMatchFavorite(matchFavorite: MatchFavorite): Completable
    fun getMatchFavorite(): Single<List<MatchFavorite>>
    fun getMatchFavoriteById(id: Int): Single<List<MatchFavorite>>
    fun deleteMatchFavorite(id : Int): Completable
}