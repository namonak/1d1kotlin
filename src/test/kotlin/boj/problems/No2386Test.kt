package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2386Test : StringSpec({
    "도비의 영어 공부 : https://www.acmicpc.net/problem/2386" {
        val given = """
            g Programming Contest
            n New Zealand
            x This is quite a simple problem.
            #
        """.trimIndent()
        val expected = """
            g 2
            n 2
            x 0
        """.trimIndent()

        No2386().solve(given.reader().buffered()) shouldBe expected
    }
})
