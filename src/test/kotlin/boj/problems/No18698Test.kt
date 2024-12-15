package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No18698Test : StringSpec({
    "The Walking Adam : https://www.acmicpc.net/problem/18698" {
        val given = """
            3
            UUUDU
            DDD
            UU
        """.trimIndent()
        val expected = """
            3
            0
            2
        """.trimIndent()

        No18698().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
