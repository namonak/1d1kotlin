package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17598Test : StringSpec({
    "Animal King Election : https://www.acmicpc.net/problem/17598" {
        val given = """
            Lion
            Lion
            Tiger
            Tiger
            Lion
            Lion
            Tiger
            Tiger
            Tiger
        """.trimIndent()
        val expected = "Tiger"

        val actual = No17598().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
