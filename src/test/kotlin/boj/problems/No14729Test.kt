package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14729Test : StringSpec({
    "칠무해 : https://www.acmicpc.net/problem/14729" {
        val given = """
            8
            20.000
            70.000
            50.000
            30.000
            70.000
            30.000
            60.000
            70.000
        """.trimIndent()
        val expected = """
            20.000
            30.000
            30.000
            50.000
            60.000
            70.000
            70.000
        """.trimIndent()

        No14729().solve(given.reader().buffered()) shouldBe expected
    }
})
