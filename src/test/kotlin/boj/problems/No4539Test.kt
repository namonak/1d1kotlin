package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4539Test : StringSpec({
    "반올림 : https://www.acmicpc.net/problem/4539" {
        val given = """
            9
            15
            14
            4
            5
            99
            12345678
            44444445
            1445
            446
        """.trimIndent()
        val expected = """
            20
            10
            4
            5
            100
            10000000
            50000000
            2000
            500
        """.trimIndent()

        No4539().solve(given.reader().buffered()) shouldBe expected
    }
})
