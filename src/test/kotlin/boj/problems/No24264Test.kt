package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24264Test : StringSpec({
    "알고리즘 수업 - 알고리즘의 수행 시간 3 : https://www.acmicpc.net/problem/24264" {
        val given = "7"
        val expected = """
            49
            2
        """.trimIndent()

        No24264().solve(given.reader().buffered()) shouldBe expected
    }
})
