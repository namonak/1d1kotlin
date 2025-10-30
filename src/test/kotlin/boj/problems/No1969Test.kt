package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1969Test : StringSpec({
    "DNA : https://www.acmicpc.net/problem/1969" {
        val testCases = listOf(
            """
                5 8
                TATGATAC
                TAAGCTAC
                AAAGATCC
                TGAGATAC
                TAAGATGT
            """.trimIndent()
                to """
                    TAAGATAC
                    7
                """.trimIndent(),
            """
                4 10
                ACGTACGTAC
                CCGTACGTAG
                GCGTACGTAT
                TCGTACGTAA
            """.trimIndent()
                to """
                    ACGTACGTAA
                    6
                """.trimIndent(),
            """
                6 10
                ATGTTACCAT
                AAGTTACGAT
                AACAAAGCAA
                AAGTTACCTT
                AAGTTACCAA
                TACTTACCAA
            """.trimIndent()
                to """
                    AAGTTACCAA
                    12
                """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No1969().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
