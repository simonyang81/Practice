package simon.practice

/**
 * Created by simon on 8/17/15.
 */

class MyClass {
    companion object Factory {
        fun create() = MyClass()
    }

    fun foo() {
        println("This is a Singleton 1")
    }
}

class MyClass1 {

    companion object {
        fun getInstance() = MyClass1()
    }

    fun foo() {
        println("This is a Singleton 2")
    }

}

