package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11371Test : StringSpec({
    "The Big Eye in the Sky : https://www.acmicpc.net/problem/11371" {
        val given = """
            5 5
            9 15
            12 6
            0 4
            0 0
        """.trimIndent()
        val expected = """
            45
            59
            27
            90
        """.trimIndent()

        No11371().solve(given.reader().buffered()) shouldBe expected
    }
})
