package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No21964Test : StringSpec({
    "선린인터넷고등학교 교가 : https://www.acmicpc.net/problem/21964" {
        val given = """
            12
            Sunrin,Hair.
        """.trimIndent()
        val expected = "Hair."

        No21964.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
