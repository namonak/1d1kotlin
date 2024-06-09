package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2012Test : StringSpec({
    "등수 매기기 : https://www.acmicpc.net/problem/2012" {
        val given = """
            5
            1
            5
            3
            1
            2
        """.trimIndent()
        val expected = "3"

        No2012().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
