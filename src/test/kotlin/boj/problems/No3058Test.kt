package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No3058Test : StringSpec({
    "짝수를 찾아라 : https://www.acmicpc.net/problem/3058" {
        val given = """
            2
            1 2 3 4 5 6 7
            13 78 39 42 54 93 86
        """.trimIndent()
        val expected = """
            12 2
            260 42
        """.trimIndent()

        No3058().solve(given.reader().buffered()) shouldBe expected
    }
})
