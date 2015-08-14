package simon.practice

/**
 * Created by simon on 8/11/15.
 */
fun main(arg: Array<String>) {

    var name = "Simon"
    println("Hello, ${name}")

    var f = MyFunction1()

    var total = f.sum1(1120, 238)
    println("The sum1 is ${total}")

    total = f.sum2(111, 333)
    println("The sum2 is ${total}")

    println("\n--->> parse int <<---")
    println(f.parseInt(""))
    println(f.parseInt(123))
    println(f.parseInt("123"))

    println("\n--->> Looper <<---")
    f.looper()

    println("\n--->> Contains <<---")
    f.containsFunc("My name is Simon", "simon");

    println("\n--->> Arrays <<---")
    println(f.arrayFunc())

    var v = 2
    println("The v=$v")

    f.controlFlow(101, 901)

    var clazz = AClass()
    clazz.foo()

    var clazzB = BClass("Simon")
    clazzB.printClass()

    println("\n--->> End <<---")

}

