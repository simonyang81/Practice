package simon.practice

/**
 * Created by simon on 8/17/15.
 */

class Outer1 {
    private val bar = 1
    class Nested {
        fun foo() = 2
    }
}

class Outer2 {
    private val bar = 1
    inner class Inner {
        fun foo() = bar
    }

}

