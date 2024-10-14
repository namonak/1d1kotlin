package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2756Test : StringSpec({
    "다트 : https://www.acmicpc.net/problem/2756" {
        val given = """
            2
            -9 0 0 -4.5 -2 2 9 0 0 4.5 2 -2
            -19.0 19.0 0 0 0 0 3 3 6 6 12 12
        """.trimIndent()
        val expected = """
            SCORE: 240 to 240, TIE.
            SCORE: 200 to 140, PLAYER 1 WINS.
        """.trimIndent()

        No2756().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
