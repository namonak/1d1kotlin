package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11008Test : StringSpec({
    "복붙의 달인 : https://www.acmicpc.net/problem/11008" {
        val given = """
            2
            banana bana
            asakusa sa
        """.trimIndent()
        val expected = """
            3
            5
        """.trimIndent()

        No11008().solve(given.reader().buffered()) shouldBe expected
    }
})
