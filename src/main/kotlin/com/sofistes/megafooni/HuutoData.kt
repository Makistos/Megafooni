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

/* Parameters that can be used to search through the Huuto.net API. Not all are listed here yet. */
/*data class HuutoSearch(val addtime: String? = null, val area: String? = null, val category: Int? = null,
                       val condition: String? = null, val closingtime: String? = null, val price_max: Float? = null,
                       val price_min: Float? = null, val seller_type: String? = null, val sellstyle: String? = null,
                       val status: String? = null, val words: String? = null)*/
data class HuutoSearch(val searchParams: Map<String, String>)