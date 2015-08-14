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
            arrays[i] = i
        }

        var total = 0
        for (v in arrays) {
            total += v
        }

        print(total)
    }


}

