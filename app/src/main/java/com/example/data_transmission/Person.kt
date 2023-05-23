package com.example.data_transmission

import java.io.Serializable

data class Person (
    val name : String,
    val country:String,
    val age :Int
) : Serializable

