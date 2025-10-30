package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5355Test : StringSpec({
    "화성 수학 : https://www.acmicpc.net/problem/5355" {
        val given = """
            3
            3 @ %
            10.4 # % @
            8 #
        """.trimIndent()
        val expected = """
            14.00
            25.20
            1.00
        """.trimIndent()

        No5355().solve(given.reader().buffered()) shouldBe expected
    }
})
