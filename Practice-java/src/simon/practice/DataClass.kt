package simon.practice

/**
 * This is called a data class
 * The compiler automatically derives the following members from all properties declared in the primary constructor:
 * equals() / hashCode() pair
 * toString()
 * componentN() functions corresponding to the properties in their order or declaration
 * copy() function
 *
 * Created by simon on 8/15/15.
 */
data class User(val name:String, val age:Int, val gender:String) {

    constructor(name:String, age:Int) : this(name, age, "UnKnown") {
    }

    constructor(name:String) : this(name, 0, "Unknown") {
    }

}