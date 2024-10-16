package boj.problems

import java.io.BufferedReader

class No3622 {
    fun solve(input: BufferedReader): String {
        val (outerRadius1, innerRadius1, outerRadius2, innerRadius2, plateRadius) =
            input.readLine().split(" ").map { it.toInt() }

        if (outerRadius1 > plateRadius || outerRadius2 > plateRadius) return "No"

        if (outerRadius1 + outerRadius2 <= plateRadius) return "Yes"

        if (innerRadius1 >= outerRadius2 || innerRadius2 >= outerRadius1) return "Yes"

        return "No"
    }
}
