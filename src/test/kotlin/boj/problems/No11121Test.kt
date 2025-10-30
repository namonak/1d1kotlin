package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11121Test : StringSpec({
    "Communication Channels : https://www.acmicpc.net/problem/11121" {
        val given = """
            2
            10 10
            10 11
        """.trimIndent()
        val expected = """
            OK
            ERROR
        """.trimIndent()

        No11121().solve(given.reader().buffered()) shouldBe expected
    }
})
