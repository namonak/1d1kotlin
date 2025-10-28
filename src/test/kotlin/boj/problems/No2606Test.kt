package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2606Test : StringSpec({
    "바이러스 : https://www.acmicpc.net/problem/2606" {
        val given = """
            7
            6
            1 2
            2 3
            1 5
            5 2
            5 6
            4 7
        """.trimIndent()
        val expected = "4"

        No2606().solve(given.reader().buffered()) shouldBe expected
    }
})
