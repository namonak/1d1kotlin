package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2857Test : StringSpec({
    "FBI : https://www.acmicpc.net/problem/2857" {
        val testCases = listOf(
            """
                N-FBI1
                9A-USKOK
                I-NTERPOL
                G-MI6
                RF-KGB1
            """.trimIndent()
                to "1",
            """
                N321-CIA
                F3-B12I
                F-BI-12
                OVO-JE-CIA
                KRIJUMCAR1
            """.trimIndent()
                to "HE GOT AWAY!",
            """
                47-FBI
                BOND-007
                RF-FBI18
                MARICA-13
                13A-FBILL
            """.trimIndent()
                to "1 3 5"
        )

        testCases.forEach { (given, expected) ->
            No2857().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
