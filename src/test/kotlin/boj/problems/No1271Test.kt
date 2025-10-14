package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1271Test : StringSpec({
    "엄청난 부자2 : https://www.acmicpc.net/problem/1271" {
        val given = "1000 100"
        val expected = """
            10
            0
        """.trimIndent()

        No1271().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
