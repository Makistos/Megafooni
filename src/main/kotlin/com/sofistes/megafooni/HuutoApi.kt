package com.sofistes.megafooni

/**
 * Created by mep on 9.11.2017.
 */

import java.net.URL

class HuutoApi(apiRoot: String) {
    val rootEndpoint = apiRoot

    fun categories(categoryNumber: String): StringBuilder =
            StringBuilder(URL(rootEndpoint + "categories/" + categoryNumber + "?max-depth=3").readText())
}
