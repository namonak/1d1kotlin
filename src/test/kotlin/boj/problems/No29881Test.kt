package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29881Test : StringSpec({
    "Account Names : https://www.acmicpc.net/problem/29881" {
        val given = """
            3
            Juku Kask
            Mann Kuusk
            Mikk Tamm
            Mikk mt
            Juku jk
            Mann mk
        """.trimIndent()
        val expected = """
            Kask jk
            Kuusk mk
            Tamm mt
        """.trimIndent()

        No29881().solve(given.reader().buffered()) shouldBe expected
    }
})
