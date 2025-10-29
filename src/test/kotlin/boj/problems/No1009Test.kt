package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1009Test : StringSpec({
    "분산처리 : https://www.acmicpc.net/problem/1009" {
        val given = """
            5
            1 6
            3 7
            6 2
            7 100
            9 635
        """.trimIndent()
        val expected = """
            1
            7
            6
            1
            9
        """.trimIndent()

        No1009().solve(given.reader().buffered()) shouldBe expected
    }
})
