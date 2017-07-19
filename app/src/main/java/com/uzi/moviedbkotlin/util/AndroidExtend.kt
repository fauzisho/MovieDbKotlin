package com.uzi.moviedbkotlin.util

import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

/**
 * Created by uzi on 19/07/17.
 * Email : fauzisholichin@gmail.com
 */

fun ImageView.loadImageFromURL(imgUrl: String?) {
    Picasso.with(this.context).load(imgUrl).into(this)
}

fun TextView.loadText(text: String?) {

}