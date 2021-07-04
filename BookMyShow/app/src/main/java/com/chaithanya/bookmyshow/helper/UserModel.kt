package com.chaithanya.bookmyshow.helper

data class UserModel(
    var email: String,
    var name: String?,
    var image_url: String?,
    var bio: String?,
    var token: String
) {
}