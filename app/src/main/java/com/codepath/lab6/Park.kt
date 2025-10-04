package com.codepath.lab6

import kotlinx.serialization.Serializable

@Serializable
data class ParksResponse(
    val data: List<Park>?
)

@Serializable
data class Park(
    val fullName: String?,
    val description: String?,
    val images: List<ParkImage>?,
) : java.io.Serializable

@Serializable
data class ParkImage(
    val url: String?
) : java.io.Serializable
