package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2712Test : StringSpec({
    "미국 스타일 : https://www.acmicpc.net/problem/2712" {
        val given = """
            5
            1 kg
            2 l
            7 lb
            3.5 g
            0 l
        """.trimIndent()
        val expected = """
            2.2046 lb
            0.5284 g
            3.1752 kg
            13.2489 l
            0.0000 g
        """.trimIndent()

        No2712().solve(given.reader().buffered()) shouldBe expected
    }
})
