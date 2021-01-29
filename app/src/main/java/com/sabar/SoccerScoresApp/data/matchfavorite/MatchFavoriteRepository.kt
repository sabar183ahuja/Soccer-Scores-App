package com.sabar.SoccerScoresApp.data.matchfavorite

import com.sabar.SoccerScoresApp.data.FavoriteDao
import com.sabar.SoccerScoresApp.data.matchfavorite.local.response.MatchFavorite
import io.reactivex.Completable
import io.reactivex.Single

class MatchFavoriteRepository(
    private val matchFavoriteDao: FavoriteDao
) : MatchFavoriteDataSource {

    override fun addMatchFavorite(matchFavorite: MatchFavorite): Completable {
        return Completable.fromAction {
            matchFavoriteDao.addFavoriteMatch(matchFavorite)
        }
    }

    override fun getMatchFavorite(): Single<List<MatchFavorite>> {
        return matchFavoriteDao.getListFavoriteMatch()
    }

    override fun getMatchFavoriteById(id: Int): Single<List<MatchFavorite>> {
        return matchFavoriteDao.getFavoriteMatchById(id)
    }

    override fun deleteMatchFavorite(id: Int): Completable {
        return Completable.fromAction {
            matchFavoriteDao.deleteFavoriteMatch(id)
        }
    }

}