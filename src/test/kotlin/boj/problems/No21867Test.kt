package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No21867Test : StringSpec({
    "Java Bitecode : https://www.acmicpc.net/problem/21867" {
        val testCases = listOf(
            """
                4
                ABCD
            """.trimIndent() to "BCD",
            """
                4
                JAVA
            """.trimIndent() to "nojava"
        )

        testCases.forEach { (given, expected) ->
            No21867().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
