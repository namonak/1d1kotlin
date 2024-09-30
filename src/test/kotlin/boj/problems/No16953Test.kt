package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16953Test : StringSpec({
    "A → B : https://www.acmicpc.net/problem/16953" {
        val testCases = listOf(
            "2 162" to "5",
            "4 42" to "-1",
            "100 40021" to "5",
            "1 2" to "2",
            "2 31" to "-1",
            "3 39" to "-1",
            "1 1024" to "11",
            "5 60" to "-1",
            "3 312" to "-1",
            "1 999999999" to "-1" // A = 1, B = 999999999: 특정 조합으로 도달 불가
        )

        testCases.forEach { (given, expected) ->
            No16953().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
