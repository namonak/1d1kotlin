package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30088Test : StringSpec({
    "공포의 면담실 : https://www.acmicpc.net/problem/30088" {
        val given = """
            3
            2 5 50
            2 20 10
            1 100
        """.trimIndent()
        val expected = "300"

        val result = No30088().solve(given.reader().buffered())
        result shouldBe expected
    }
})
