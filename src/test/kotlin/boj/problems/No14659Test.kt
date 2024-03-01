package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14659Test : StringSpec({
    "한조서열정리하고옴ㅋㅋ : https://www.acmicpc.net/problem/14659" {
        val given = """
            7
            6 4 10 2 5 7 11
        """.trimIndent()
        val expected = "3"

        No14659().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
