package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No20362Test : StringSpec({
    "유니대전 퀴즈쇼 : https://www.acmicpc.net/problem/20362" {
        val testCases = listOf(
            """
                3 duck
                oridya hello
                orihehe hi
                duck hi
            """.trimIndent() to "1",
            """
                8 orihehe
                orihehe duck
                skynet duck
                rdd duck
                vega duck
                reversing duck
                dongbin duck
                kimyh duck
                hunni duck
            """.trimIndent() to "0",
            """
                8 orihehe
                hunni duck
                skynet duck
                rdd duck
                vega duck
                reversing duck
                dongbin duck
                kimyh duck
                orihehe duck
            """.trimIndent() to "7",
            """
                8 orihehe
                hunni dduck
                skynet dduck
                rdd dduck
                vega dduck
                reversing dduck
                dongbin dduck
                kimyh dduck
                orihehe duck
            """.trimIndent() to "0"
        )

        testCases.forEach { (given, expected) ->
            No20362().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
