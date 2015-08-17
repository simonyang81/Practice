package simon.practice

/**
 * Created by simon on 8/17/15.
 */
open class OE(value:Int) {
    public open val v1: Int = value

    fun printSelf() {
        println("OE, v1 = $v1")
    }

}