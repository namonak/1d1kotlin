package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1247Test : StringSpec({
    "부호 : https://www.acmicpc.net/problem/1247" {
        val given = """
            3
            0
            0
            0
            10
            1
            2
            4
            8
            16
            32
            64
            128
            256
            -512
            6
            9223372036854775807
            9223372036854775806
            9223372036854775805
            -9223372036854775807
            -9223372036854775806
            -9223372036854775804
        """.trimIndent()
        val expected = """
            0
            -
            +
        """.trimIndent()

        No1247().solve(given.reader().buffered()) shouldBe expected
    }
})
