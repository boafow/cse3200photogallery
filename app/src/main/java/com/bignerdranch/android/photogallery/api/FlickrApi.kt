package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "b126613a39e0d102a114ca84db267fd9"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest/?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String) : FlickrResponse
}
