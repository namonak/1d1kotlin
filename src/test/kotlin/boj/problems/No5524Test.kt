package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5524Test : StringSpec({
    "입실 관리 : https://www.acmicpc.net/problem/5524" {
        val testCases = listOf(
            """
                3
                WatanabE
                ITO
                YamaMoto
            """.trimIndent()
                to
                    """
                watanabe
                ito
                yamamoto
                    """.trimIndent(),
            """
                4
                SUZUKI
                tanaka
                tAkAhAshi
                SuZuKi
            """.trimIndent()
                to
                    """
                suzuki
                tanaka
                takahashi
                suzuki
                    """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No5524.solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
