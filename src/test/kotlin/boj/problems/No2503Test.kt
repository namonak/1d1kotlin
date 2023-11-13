package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2503Test : StringSpec({
    "숫자 야구 : https://www.acmicpc.net/problem/2503" {
        val given = """
            4
            123 1 1
            356 1 0
            327 2 0
            489 0 1
        """.trimIndent()
        val expected = "2"

        No2503.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
