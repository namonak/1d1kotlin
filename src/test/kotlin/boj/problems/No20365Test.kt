package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20365Test : StringSpec({
    "블로그2 : https://www.acmicpc.net/problem/20365" {
        val given = """
            8
            BBRBRBBR
        """.trimIndent()
        val expected = "4"

        No20365().solve(given.reader().buffered()) shouldBe expected
    }
})
