package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No24263Test : StringSpec({
    "알고리즘 수업 - 알고리즘의 수행 시간 2 : https://www.acmicpc.net/problem/24263" {
        val given = "7"
        val expected = """
            7
            1
        """.trimIndent()

        No24263().solve(given.reader().buffered()) shouldBe expected
    }
})
