package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28114Test : StringSpec({
    "팀명 정하기 : https://www.acmicpc.net/problem/28114" {
        val testCases = listOf(
            """
                600 2018 AHN
                2000 2019 LEE
                6000 2020 OH
            """.trimIndent() to """
                181920
                OLA
            """.trimIndent(),
            """
                1000 2022 PARK
                9000 2021 NAH
                2000 2019 LEE
            """.trimIndent() to """
                192122
                NLP
            """.trimIndent()
        )

        for ((given, expected) in testCases) {
            val actual = No28114().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})
