package boj.problems

import java.io.BufferedReader

object No27889 {
    fun solve(input: BufferedReader): String {
        when (input.readLine()) {
            "NLCS" -> return "North London Collegiate School"
            "BHA" -> return "Branksome Hall Asia"
            "KIS" -> return "Korea International School"
            "SJA" -> return "St. Johnsbury Academy"
        }
        return ""
    }
}
