package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2445Test : StringSpec({
    "별 찍기 - 8 : https://www.acmicpc.net/problem/2445" {
        val given = "5"
        val expected = """
            *        *
            **      **
            ***    ***
            ****  ****
            **********
            ****  ****
            ***    ***
            **      **
            *        *
        """.trimIndent()

        No2445().solve(given.reader().buffered()) shouldBe expected
    }
})
