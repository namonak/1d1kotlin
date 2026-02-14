package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No29716Test : StringSpec({
    "풀만한문제 : https://www.acmicpc.net/problem/29716" {
        val given = """
            8 4
            Quatro cheese pizza
            Alloy coin
            PiPi
            1 2 3
        """.trimIndent()
        val expected = "1"

        No29716().solve(given.reader().buffered()) shouldBe expected
    }
})
