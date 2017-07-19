package com.uzi.moviedbkotlin.ui

import android.util.Log
import com.google.gson.Gson
import com.uzi.moviedbkotlin.data.MovieRepository
import com.uzi.moviedbkotlin.data.TheMovieDBApi
import com.uzi.moviedbkotlin.data.model.PopularMovieResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */
class MainPresenter(val view: MainView,
                    val movieRepository: MovieRepository,
                    val gson: Gson) {

    fun getFavMovie(page: Int) {
        Log.d("tag", "get fav movie $page")
        view.showLoading()
        // do async
        doAsync {
            val result = gson.fromJson(movieRepository
                    .getFavoriteMovie(TheMovieDBApi.getPopularMovie(page)),
                    PopularMovieResponse::class.java
            )

            view.hideLoading()
            uiThread {
                    view.displayResult(result.results)
            }
        }

    }

}