package com.example.worldmapexplorer.data.network.api

import com.example.worldmapexplorer.data.network.dto.PlaceBordersDto
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApi {
//
//    @GET("search.php")
//    suspend fun getGeocoding(
//        @Query("q") q: String,
//        @Query("format") format: String,
//        @Query("exclude_place_ids") exclude_place_ids: String
//    ): ApiResponse<GeocodingResponseDto>

    @GET("reverse")
    suspend fun getPlaceBorders(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("zoom") zoom: Int,
        @Query("format") format: String,
        @Query("polygon_geojson") polygonGeojson: Int,
        @Query("polygon_threshold") polygonThreshold: Double
    ): ApiResponse<PlaceBordersDto>

}

