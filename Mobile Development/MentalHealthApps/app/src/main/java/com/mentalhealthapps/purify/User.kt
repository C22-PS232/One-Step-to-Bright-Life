package com.mentalhealthapps.purify

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    var Nickname: String,
    var Email: String,
    var Password: String,
    var Contact: String,
    var Avatar: Int,
) : Parcelable