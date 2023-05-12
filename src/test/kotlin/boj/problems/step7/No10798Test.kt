package boj.problems.step7

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.InputStreamReader

class No10798Test : StringSpec({
    "세로읽기 : https://www.acmicpc.net/problem/10798" {
        // given
        val testCases = listOf(
            "ABCDE\nabcde\n01234\nFGHIJ\nfghij" to "Aa0FfBb1GgCc2HhDd3IiEe4Jj",
            "AABCDD\nafzz\n09121\na8EWg6\nP5h3kx" to "Aa0aPAf985Bz1EhCz2W3D1gkD6x"
        )

        testCases.forEach { (given, expected) ->
            // when
            val actual = No10798.solve(BufferedReader(InputStreamReader(given.byteInputStream())))

            // then
            actual shouldBe expected
        }
    }
})
