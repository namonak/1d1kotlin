package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1246Test : StringSpec({
    "온라인 판매 : https://www.acmicpc.net/problem/1246" {
        val given = """
            5 4
            2
            8
            10
            7
        """.trimIndent()
        val expected = "7 21"

        No1246().solve(given.reader().buffered()) shouldBe expected
    }
})
