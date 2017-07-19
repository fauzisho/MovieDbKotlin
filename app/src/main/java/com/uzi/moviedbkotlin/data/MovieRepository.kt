package com.uzi.moviedbkotlin.data

import android.util.Log
import java.net.URL

/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */
class MovieRepository {
    fun getFavoriteMovie(url: String): String {
        Log.d("tag", "url $url")
        val result = URL(url).readText()
        return result
    }
}