package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1316Test : StringSpec({
    "그룹 단어 체커 : https://www.acmicpc.net/problem/1316" {
        val testCases = listOf(
            """
                3
                happy
                new
                year
            """.trimIndent() to "3",
            """
                4
                aba
                abab
                abcabc
                a
            """.trimIndent() to "1",
            """
                5
                ab
                aa
                aca
                ba
                bb
            """.trimIndent() to "4",
            """
                2
                yzyzy
                zyzyz
            """.trimIndent() to "0",
            """
                1
                z
            """.trimIndent() to "1",
            """
                9
                aaa
                aaazbz
                babb
                aazz
                azbz
                aabbaa
                abacc
                aba
                zzaz
            """.trimIndent() to "2"
        )

        testCases.forEach { (given, expected) ->
            No1316().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
