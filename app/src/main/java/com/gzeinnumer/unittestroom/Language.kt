package com.gzeinnumer.unittestroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "language")
data class Language(
    var languageName : String="",
    var experience : String=""
) {
    @field:PrimaryKey(autoGenerate = true)
    var id : Long=0
}