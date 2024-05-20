package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30087Test : StringSpec({
    "진흥원 세미나 : https://www.acmicpc.net/problem/30087" {
        val testCases = listOf(
            """
                4
                Algorithm
                Network
                CyberSecurity
                Startup
            """.trimIndent() to """
                204
                303
                B101
                501
            """.trimIndent(),
            """
                2
                Network
                Algorithm
            """.trimIndent() to """
                303
                204
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            No30087().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
