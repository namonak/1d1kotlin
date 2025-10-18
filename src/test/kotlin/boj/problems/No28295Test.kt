package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28295Test : StringSpec({
    "체육은 코딩과목 입니다 : https://www.acmicpc.net/problem/28295" {
        val given = """
            1
            2
            3
            1
            2
            3
            1
            2
            3
            1
        """.trimIndent()
        val expected = "W"

        No28295().solve(given.reader().buffered()) shouldBe expected
    }
})
