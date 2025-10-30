package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1296Test : StringSpec({
    "팀 이름 정하기 : https://www.acmicpc.net/problem/1296" {
        val testCases = listOf(
            """
                LOVE
                3
                JACOB
                FRANK
                DANO
            """.trimIndent()
                to "FRANK",
            """
                JANE
                4
                THOMAS
                MICHAEL
                INDY
                LIU
            """.trimIndent()
                to "INDY",
            """
                LILLY
                1
                PIERRE
            """.trimIndent()
                to "PIERRE",
            """
                MERYLOV
                5
                JOHN
                DAVE
                STEVE
                JOHN
                DAVE
            """.trimIndent()
                to "DAVE",
            """
                LLOL
                4
                BVERON
                CVERON
                AVERON
                DVERON
            """.trimIndent()
                to "AVERON",
            """
                VELYLEOCEVE
                5
                YVXHOVE
                LCOKO
                OGWSJVEVEDLE
                WGFVSJEL
                VLOLUVCBLLQVESWHEEKC
            """.trimIndent()
                to "VLOLUVCBLLQVESWHEEKC"
        )

        testCases.forEach { (given, expected) ->
            No1296().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
