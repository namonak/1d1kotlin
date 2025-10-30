package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30009Test : StringSpec({
    "포지션 제로 : https://www.acmicpc.net/problem/30009" {
        val given = """
            3
            1 2 2
            -1
            1
            5
        """.trimIndent()
        val expected = "1 1"

        No30009().solve(given.reader().buffered()) shouldBe expected
    }
})
