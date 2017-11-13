package com.sofistes.megafooni

/**
 * Created by mep on 11.11.2017.
 */
data class HuutoItem(val id: Int?, val title: String?, val status: String?,
                val description: String?, val currentPrice: Int?, val buyNowPrice: Int?,
                val saleMethod: String?, val listTime: String?, val condition: String?,
                val closingTime: String?
                )

data class HuutoCategories(val categories: Array<HuutoCategory>, val id: Int?, val links: Map<String, String>?,
                      val title: String?, val updated: String?)

data class HuutoCategory(val id: Int?, val title: String?, val links: Map<String, String>?)


