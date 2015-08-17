package simon.practice

/**
 * Created by simon on 8/11/15.
 */
fun main(arg: Array<String>) {

    println("--->> Start <<---")

//    var name = "Simon"
//    println("Hello, ${name}")
//
//    var f = MyFunction1()
//
//    var total = f.sum1(1120, 238)
//    println("The sum1 is ${total}")
//
//    total = f.sum2(111, 333)
//    println("The sum2 is ${total}")
//
//    println("\n--->> parse int <<---")
//    println(f.parseInt(""))
//    println(f.parseInt(123))
//    println(f.parseInt("123"))
//
//    println("\n--->> Looper <<---")
//    f.looper()
//
//    println("\n--->> Contains <<---")
//    f.containsFunc("My name is Simon", "simon");
//
//    println("\n--->> Arrays <<---")
//    println(f.arrayFunc())
//
//    var v = 2
//    println("The v=$v")
//
//    f.controlFlow(101, 901)
//
//    var clazz = AClass()
//    clazz.foo()
//
//    var clazzB = BClass("Simon")
//    clazzB.printClass()

    var u1 = User(name = "Jack", age = 18)
    val u2 = u1.copy()
    val u3 = u1.copy(name = "Simon")

    println("u1==u2:${u1==u2}; u1===u2:${u1===u2}; u1==u3:${u1==u3}")

    val u4 = User(name = "Simon", age = 34, gender = "Male")
    println("u1:$u1; \nu2:$u2; \nu3:$u3; \nu4:$u4")

    var v1 = Outer1.Nested().foo()
    var v2 = Outer2().Inner().foo()

    println("NestedInnerClass, v1=$v1; v2=$v2")

    testOE()
    testObjectSingleton()

    println("\n--->> End <<---")

}

/**
 * Object expressions
 *
 * Sometimes we need to create an object of a slight modification of some class, without explicitly declaring a new subclass for it.
 * Java handles this case with anonymous inner classes.
 * Kotlin slightly generalizes this concept with object expressions and object declarations.
 *
 */
fun testOE() {

    println("\n\n--->> Object expressions <<---")
    var oe = OE(2)
    oe.printSelf()
    oe = object : OE(2) {
        override val v1 = 10
    }
    oe.printSelf();
    println("--->> Object expressions End <<---")

}

fun testObjectSingleton() {
    val instance = MyClass.create()
    instance.foo()

    val instance1 = MyClass1.getInstance();
    instance1.foo()

}

