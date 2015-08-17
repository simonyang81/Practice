package simon.practice

import kotlin.properties.Delegates

/**
 * Created by simon on 8/17/15.
 */
class SroringPropertiesInMap(val map : Map<String, Any>) {
    val name : String by Delegates.mapVal(map)
    val age : Int by Delegates.mapVal(map)

    fun printSelf() {
        println("name=$name; age=$age")
    }
}