/**
 * Created by mep on 28.10.2017.
 */

package com.sofistes.megafooni

import java.net.URL
import com.beust.klaxon.Parser
import com.beust.klaxon.JsonObject
import com.beust.klaxon.JsonArray
//import org.json.*


fun main(args: Array<String>) {
    val result : StringBuilder = StringBuilder(URL("https://api.huuto.net/1.1/categories").readText())
    val parser: Parser = Parser()
    val json: JsonObject = parser.parse(result) as JsonObject
    //println(json.toJsonString(true))
    //val array: JsonArray<Any?> = json["categories"]
    val array = json["categories"] as JsonArray<JsonObject>

    println(array.toJsonString(true))
    println(array[0])
    val titles = array[0]["title"]
    array.forEach { println(it["title"])}
    println("$titles")
    //println("$titles")
    //val cats = json.

}


/**
public class MegafooniMain {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val result = URL("https://api.huuto.net/1.1/categories").readText()
            print(result)
            val parser: Parser = Parser()
            val json: JsonObject = parser.parse(result) as JsonObject
            //println()

        }
    }
    fun parse(name: String): Any? {
        val cls = Parser::class.java
        return cls.getResourceAsStream(name)?.let { inputStream ->
            return Parser().parse(inputStream)
        }
    }
}
 */
