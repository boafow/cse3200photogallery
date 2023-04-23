package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "b126613a39e0d102a114ca84db267fd9"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}
