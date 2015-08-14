package simon.practice

/**
 * Created by simon on 8/14/15.
 */
interface MyInterface {
    fun foo() {
        println("Interface A")
    }
}

class AClass : MyInterface {
    override fun foo() {
        println("AClass foo")
    }
}

class BClass constructor(arg:String) : MyInterface {
    private var v1 : String = "Hello, "
    private var v2 : String = arg
    fun printClass() {
        println(v1 + v2)
    }

    override fun foo() {

    }


}