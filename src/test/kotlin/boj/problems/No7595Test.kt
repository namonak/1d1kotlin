package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No7595Test : StringSpec({
    "Triangles : https://www.acmicpc.net/problem/7595" {
        val given = """
            5
            3
            2
            7
            0
        """.trimIndent()
        val expected = """
            *
            **
            ***
            ****
            *****
            *
            **
            ***
            *
            **
            *
            **
            ***
            ****
            *****
            ******
            *******
        """.trimIndent()

        No7595().solve(given.reader().buffered()) shouldBe expected
    }
})
