package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2002Test : StringSpec({
    "추월 : https://www.acmicpc.net/problem/2002" {
        val testCases = listOf(
            """
                4
                ZG431SN
                ZG5080K
                ST123D
                ZG206A
                ZG206A
                ZG431SN
                ZG5080K
                ST123D
            """.trimIndent() to "1",
            """
                5
                ZG508OK
                PU305A
                RI604B
                ZG206A
                ZG232ZF
                PU305A
                ZG232ZF
                ZG206A
                ZG508OK
                RI604B
            """.trimIndent() to "3",
            """
                5
                ZG206A
                PU234Q
                OS945CK
                ZG431SN
                ZG5962J
                ZG5962J
                OS945CK
                ZG206A
                PU234Q
                ZG431SN
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No2002().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
