package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11053Test : StringSpec({
    "가장 긴 증가하는 부분 수열 : https://www.acmicpc.net/problem/11053" {
        val given = """
            6
            10 20 10 30 20 50
        """.trimIndent()
        val expected = "4"

        No11053().solve(given.reader().buffered()) shouldBe expected
    }
})
