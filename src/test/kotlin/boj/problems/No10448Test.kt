package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10448Test : StringSpec({
    "유레카 이론 : https://www.acmicpc.net/problem/10448" {
        val given = """
            3
            10
            20
            1000
        """.trimIndent()
        val expected = """
            1
            0
            1
        """.trimIndent()

        No10448().solve(given.reader().buffered()) shouldBe expected
    }
})
