package com.ginaf.safinance.data.remote.response

import com.google.gson.annotations.SerializedName

data class TransactionResponse(

	@field:SerializedName("data")
	val data: Transaction,

	@field:SerializedName("message")
	val message: String
)

data class Transaction(

	@field:SerializedName("date")
	val date: String,

	@field:SerializedName("amount")
	val amount: Int,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("user_id")
	val userId: Int,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("category")
	val category: String
)
