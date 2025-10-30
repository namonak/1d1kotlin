package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9229Test : StringSpec({
    "단어 사다리 : https://www.acmicpc.net/problem/9229" {
        val given = """
            BARK
            BARE
            #
            BEAK
            BRAK
            BRAD
            BEAD
            #
            BEAK
            BEAD
            BEND
            LEND
            LAND
            LANE
            LAKE
            #
            MAKE
            BAKE
            BONK
            BONE
            BANE
            #
            #
        """.trimIndent()
        val expected = """
            Correct
            Correct
            Correct
            Incorrect
        """.trimIndent()

        No9229().solve(given.reader().buffered()) shouldBe expected
    }
})
