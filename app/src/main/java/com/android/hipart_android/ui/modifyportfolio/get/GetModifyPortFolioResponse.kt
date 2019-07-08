package com.android.hipart_android.ui.modifyportfolio.get


import com.google.gson.annotations.SerializedName

data class GetModifyPortFolioResponse(
    @SerializedName("status")
    var status: Int,
    @SerializedName("success")
    var success: Boolean,
    @SerializedName("message")
    var message: String,
    @SerializedName("data")
    var data: GetModifyPortFolioData
)

data class GetModifyPortFolioData(
    @SerializedName("user_nickname")
    var userNickname: String,
    @SerializedName("user_img")
    var userImg: String,
    @SerializedName("user_type")
    var userType: Int,
    @SerializedName("detail_platform")
    var detailPlatform: Int,
    @SerializedName("detail_oneline")
    var detailOneline: String,
    @SerializedName("detail_appeal")
    var detailAppeal: String,
    @SerializedName("detail_want")
    var detailWant: String,
    @SerializedName("work_idx")
    var workIdx: List<Int>,
    //크리에이터
    @SerializedName("detail_subscriber")
    var detailSubscriber : Int,
    @SerializedName("thumbnail")
    var thumbnail: List<String>,
    @SerializedName("url")
    var url: List<String>,
    @SerializedName("work_idx")
    var title: List<String>,
    @SerializedName("work_idx")
    var content: List<String>,
    //트랜슬레이터
    @SerializedName("before")
    var before: List<String>,
    @SerializedName("after")
    var after: List<String>,
    //공통
    @SerializedName("hifive")
    var hifive: List<Int>,
    @SerializedName("pick")
    var pick: Int,
    //필터
    @SerializedName("concept")
    var concept: Int,
    @SerializedName("lang")
    var lang: Int,
    @SerializedName("pd")
    var pd: Int,
    @SerializedName("etc")
    var etc: Int
)