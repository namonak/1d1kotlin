package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30454Test : StringSpec({
    "얼룩말을 찾아라! : https://www.acmicpc.net/problem/30454" {
        val given = """
            5 9
            110010101
            101010100
            000011111
            011011010
            100100101
        """.trimIndent()
        val expected = "4 3"

        No30454().solve(given.reader().buffered()) shouldBe expected
    }
})
