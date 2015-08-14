package simon.practice

/**
 * Created by simon on 8/12/15.
 */
class MyFunction1() {

    fun sum1(v1:Int, v2:Int) = v1 + v2

    fun sum2(v1:Int, v2:Int) : Int {
        return v1 + v2
    }

    fun parseInt(v1:Any) : Int? {
        if (v1 != null && (v1 is String) && "".equals(v1) == false) {
            return Integer.parseInt(v1)
        }

        return null
    }

    fun looper() {
        var arrays = IntArray(10)
        for (i in arrays.indices) {

            when (i) {
                1   -> println("One")
                2   -> println("Two")
                is Int  -> println("Integer")
                else    -> println("Unknown")
            }

            arrays[i] = i + 1
        }

        for (i in arrays.indices) {
            if (i in 0..2) {
                println("i:${i}")
            }
        }

        var total = 0
        for (v in arrays) {
            total += v
        }

        println("1+2+3+ ... +9+10=${total}")
    }

    fun containsFunc(v:String, seq:CharSequence) {
        if (v.contains(seq, true)) {
            println("YES")
        } else {
            println("NO")
        }
    }

    fun arrayFunc() {
        // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
        val asc = Array(5, {i -> (i * i).toString()})

        for (v in asc) {
            print(v + ",")
        }

    }

    fun controlFlow(v1:Int, v2:Int) {
        var max = if (v1 >= v2) {
            println("Choose v1")
            v1
        } else {
            println("Choose v2")
            v2
        }

        println("The max=$max")

    }



}

