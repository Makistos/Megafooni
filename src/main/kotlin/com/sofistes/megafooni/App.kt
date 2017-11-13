/**
 * Created by mep on 28.10.2017.
 */

package com.sofistes.megafooni

import com.beust.klaxon.Parser
import com.beust.klaxon.JsonObject
import com.beust.klaxon.JsonArray
//import org.json.*


fun main(args: Array<String>) {
    val parser: Parser = Parser()
    val huuto = HuutoApi("https://api.huuto.net/1.1/")
    //val result = huuto.categories("")
    val result = huuto.getItem(457421076)
    print(result)
    //val json: JsonObject = parser.parse(result) as JsonObject
    //println(json.toJsonString(true))
    //val array: JsonArray<Any?> = json["categories"]
    //val array = json["categories"] as JsonArray<JsonObject>

    //println(array.toJsonString(true))
    //println(array[0])
    //val titles = array[0]["title"]
    //array.forEach { println(it["title"])}
    //println("$titles")

}


