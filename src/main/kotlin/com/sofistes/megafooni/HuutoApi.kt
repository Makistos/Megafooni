package com.sofistes.megafooni

/**
 * Created by mep on 9.11.2017.
 */

import com.beust.klaxon.*
import java.net.URL
import com.sofistes.megafooni.HuutoItem

class HuutoApi() {
    val rootEndpoint = "https://api.huuto.net/1.1/"

    fun categories(categoryNumber: String): StringBuilder =
            StringBuilder(URL(rootEndpoint + "categories/" + categoryNumber + "?max-depth=3").readText())

    fun newItem(item: JsonObject) = HuutoItem(id = item.int("id"), title = item.string("title"),
            buyNowPrice = item.int("buyNowPrice"), closingTime = item.string("closingTime"),
            condition = item.string("condition"), currentPrice = item.int("currentPrice"),
            description = item.string("description"), listTime = item.string("listTime"),
            saleMethod = item.string("saleMethod"), status = item.string("status"))

    fun getItem(id: Int): HuutoItem {
        val parser =  Parser()
        val result: StringBuilder = StringBuilder(URL(rootEndpoint + "items/" + id).readText())
        val json: JsonObject = parser.parse(result) as JsonObject
        return newItem(json)
        }

    fun getItems(params: HuutoSearch): StringBuilder {
        val paramStr = params.searchParams.map { (field, value) -> "&$field=\"$value\""}.joinToString(separator="&", prefix="?")
        return StringBuilder(URL(rootEndpoint + "items" + paramStr).readText())
    }
}


