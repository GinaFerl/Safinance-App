package com.ginaf.safinance.data.remote.response

import com.google.gson.annotations.SerializedName

data class UserResponse(

	@field:SerializedName("data")
	val data: List<UserItem>,

	@field:SerializedName("message")
	val message: String
)

data class UserItem(

	@field:SerializedName("profile_image")
	val profileImage: String,

	@field:SerializedName("role")
	val role: String,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("username")
	val username: String
)
