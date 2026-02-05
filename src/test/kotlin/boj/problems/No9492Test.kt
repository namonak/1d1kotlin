package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9492Test : StringSpec({
    "Perfect Shuffle : https://www.acmicpc.net/problem/9492" {
        val given = """
            4
            ACE
            KING
            QUEEN
            JACK
            5
            SKIP
            DRAW-TWO
            REVERSE
            WILD
            WILD-DRAW-FOUR
            0
        """.trimIndent()
        val expected = """
            ACE
            QUEEN
            KING
            JACK
            SKIP
            WILD
            DRAW-TWO
            WILD-DRAW-FOUR
            REVERSE
        """.trimIndent()

        No9492().solve(given.reader().buffered()) shouldBe expected
    }
})
