package com.sabar.SoccerScoresApp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.sabar.SoccerScoresApp.R
import com.sabar.SoccerScoresApp.base.BaseActivity
import com.sabar.SoccerScoresApp.ui.favorite.FavoriteFragment
import com.sabar.SoccerScoresApp.ui.league.LeagueFragment
import com.sabar.SoccerScoresApp.utils.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    companion object {
        fun start(context: Context) {
            context.startActivity(
                Intent(context, MainActivity::class.java)
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(R.id.frameMain, LeagueFragment.newInstance(), false)

        bottomNavigation.apply {
            add(
                MeowBottomNavigation.Model(
                    1,
                    R.drawable.ic_ball_home
                )
            )
            add(
                MeowBottomNavigation.Model(
                    2,
                    R.drawable.ic_favorite
                )
            )
        }

        bottomNavigation.setOnShowListener {
            replaceFragment(R.id.frameMain, LeagueFragment.newInstance(), false)
        }

        bottomNavigation.show(1)

        bottomNavigation.setOnClickMenuListener {
            when (it.id) {
                1 -> {
                    replaceFragment(R.id.frameMain, LeagueFragment.newInstance(), false)
                }
                2 -> {
                    replaceFragment(R.id.frameMain, FavoriteFragment.newInstance(), false)
                }
            }
        }
    }
}