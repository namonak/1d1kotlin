package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1340Test : StringSpec({
    "연도 진행바 : https://www.acmicpc.net/problem/1340" {
        val testCases = listOf(
            "May 10, 1981 00:31" to "35.348363774733635",
            "January 01, 2008 00:00" to "0.0",
            "December 31, 2007 23:59" to "99.99980974124807",
            "July 02, 2007 12:00" to "50.0",
            "July 02, 2008 00:00" to "50.0",
            "January 31, 1900 00:47" to "8.228120243531203"
        )

        testCases.forEach { (given, expected) ->
            No1340().solve(BufferedReader(given.reader())) shouldBe String.format("%.9f", expected.toDouble())
        }
    }
})
