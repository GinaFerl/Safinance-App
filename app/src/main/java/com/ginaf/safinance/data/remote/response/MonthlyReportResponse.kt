package com.ginaf.safinance.data.remote.response

import com.google.gson.annotations.SerializedName

data class MonthlyReportResponse(

	@field:SerializedName("data")
	val data: List<MonthlyReport>,

	@field:SerializedName("message")
	val message: String
)

data class MonthlyReport(

	@field:SerializedName("total_expense")
	val totalExpense: Int,

	@field:SerializedName("total_income")
	val totalIncome: Int,

	@field:SerializedName("month")
	val month: String,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("user_id")
	val userId: Int,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("cash_balance")
	val cashBalance: Int
)
