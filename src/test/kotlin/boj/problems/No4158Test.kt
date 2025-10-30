package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4158Test : StringSpec({
    "CD : https://www.acmicpc.net/problem/4158" {
        val given = """
            3 3
            1
            2
            3
            1
            2
            4
            0 0
        """.trimIndent()
        val expected = "2"

        No4158().solve(given.reader().buffered()) shouldBe expected
    }
})
