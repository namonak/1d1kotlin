package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1431Test : StringSpec({
    "시리얼 번호 : https://www.acmicpc.net/problem/1431" {
        val testCases = listOf(
            """
                5
                ABCD
                145C
                A
                A910
                Z321
            """.trimIndent()
                to
                    """
                        A
                        ABCD
                        Z321
                        145C
                        A910
                    """.trimIndent(),
            """
                2
                Z19
                Z20
            """.trimIndent()
                to
                    """
                        Z20
                        Z19
                    """.trimIndent(),
            """
                4
                34H2BJS6N
                PIM12MD7RCOLWW09
                PYF1J14TF
                FIPJOTEA5
            """.trimIndent()
                to
                    """
                        FIPJOTEA5
                        PYF1J14TF
                        34H2BJS6N
                        PIM12MD7RCOLWW09
                    """.trimIndent(),
            """
                5
                ABCDE
                BCDEF
                ABCDA
                BAAAA
                ACAAA
            """.trimIndent()
                to
                    """
                        ABCDA
                        ABCDE
                        ACAAA
                        BAAAA
                        BCDEF
                    """.trimIndent(),
        )

        testCases.forEach { (given, expected) ->
            No1431.solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
