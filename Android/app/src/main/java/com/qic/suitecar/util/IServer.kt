package com.qic.suitecar.util

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface IServer {
    @POST("signUp")
    @FormUrlEncoded
    fun signUp(
        @Field("device") device: Int,
        @Field("fname") fname: String,
        @Field("lname") lname: String,
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("email") email: String,
        @Field("phone") phone: String
    ): Call<ResponseBody>

    @POST("signIn")
    @FormUrlEncoded
    fun signIn(
        @Field("device") device: Int,
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<ResponseBody>

    @POST("signOut")
    @FormUrlEncoded
    fun signOut(
        @Field("device") device: Int,
        @Field("user_no") user_no: Int
    ): Call<ResponseBody>

    @POST("changePassword")
    @FormUrlEncoded
    fun changePassword(
        @Field("device") device: Int,
        @Field("user_no") user_no: Int,
        @Field("originalPassword") originalPassword: String,
        @Field("newPassword") newPassword: String,
        @Field("confirmPassword") confirmPassword: String
    ): Call<ResponseBody>

    @POST("forgottenPassword")
    @FormUrlEncoded
    fun forgottenPassword(
        @Field("device") device: Int,
        @Field("username") username: String,
        @Field("email") email: String
    ): Call<ResponseBody>

    @POST("idCancellation")
    @FormUrlEncoded
    fun closeAccount(
        @Field("device") device: Int,
        @Field("user_no") user_no: Int,
        @Field("password") password: String
    ): Call<ResponseBody>

    @GET("sensorList")
    fun sensorList(
        @Query("device") device: Int,
        @Query("user_no") user_no: Int
    ): Call<ResponseBody>

    @POST("sensorRegistration")
    @FormUrlEncoded
    fun sensorRegistration(
        @Field("device") device: Int,
        @Field("user_no") user_no: Int,
        @Field("type") type: String,
        @Field("mac_address") mac_address: String,
        @Field("sname") sname: String
    ): Call<ResponseBody>

    @POST("sensorDeRegistration")
    @FormUrlEncoded
    fun sensorDeRegistration(
        @Field("device") device: Int,
        @Field("user_no") user_no: Int,
        @Field("sensor_no") sensor_no: Int
    ): Call<ResponseBody>

    @POST("sensorAssociation")
    @FormUrlEncoded
    fun sensorAssociation(
        @Field("device") device: Int,
        @Field("sensor_no") sensor_no: Int,
        @Field("status") status: Int
    ): Call<ResponseBody>

    @POST("polarDataTransfer")
    @FormUrlEncoded
    fun polarDataTransfer(
        @Field("device") device: Int,
        @Field("sensor_no") sensor_no: Int,
        @Field("user_no") user_no: Int,
        @Field("time") time: String,
        @Field("heart") heart: Int,
        @Field("rr_interval") rr_interval: Int,
        @Field("latitude") latitude: Float,
        @Field("longitude") longitude: Float
    ): Call<ResponseBody>

    @POST("udooDataTransfer")
    @FormUrlEncoded
    fun udooDataTransfer(
            @Field("device") device: Int,
            @Field("sensor_no") sensor_no: Int,
            @Field("time") time: String,
            @Field("temperature") temperature: Double,
            @Field("NO2") NO: Double,
            @Field("O3") O3: Double,
            @Field("CO") CO: Double,
            @Field("SO2") SO2: Double,
            @Field("PM25") PM25: Double,
            @Field("NO2_AQI") NO2_AQI: Double,
            @Field("O3_AQI") O3_AQI: Double,
            @Field("CO_AQI") CO_AQI: Double,
            @Field("SO2_AQI") SO2_AQI: Double,
            @Field("PM25_AQI") PM25_AQI: Double,
            @Field("latitude") latitude: Float,
            @Field("longitude") longitude: Float
            ): Call<ResponseBody>

    @GET("db_data_for_map")
    fun db_data_for_map(): Call<ResponseBody>
}