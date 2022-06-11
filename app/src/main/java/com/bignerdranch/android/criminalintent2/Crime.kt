package com.bignerdranch.android.criminalintent2

import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    val date: Date = Date(),
    var title: String = "",
    var isSolved: Boolean = false
) {

}