package com.bombadu.retorfitcc


import com.google.gson.annotations.SerializedName

data class Todo(
    var completed: Boolean,
    var id: Int,
    var title: String,
    var userId: Int
)