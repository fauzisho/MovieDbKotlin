package com.uzi.moviedbkotlin.ui

import com.uzi.moviedbkotlin.data.model.Movie

/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */
interface MainView {
    fun showLoading()
    fun displayResult(result: List<Movie>)
    fun hideLoading()
}