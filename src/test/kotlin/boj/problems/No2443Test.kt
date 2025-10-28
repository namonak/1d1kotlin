package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2443Test : StringSpec({
    "별 찍기 - 6 : https://www.acmicpc.net/problem/2443" {
        val given = "5"
        val expected = """
            *********
             *******
              *****
               ***
                *
        """.trimIndent()

        No2443().solve(given.reader().buffered()) shouldBe expected
    }
})
