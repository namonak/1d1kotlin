package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11337Test : StringSpec({
    "Largest inscribed rectangle : https://www.acmicpc.net/problem/11337" {
        val given = """
            3
            1 1
            1 2
            2 2
        """.trimIndent()
        val expected = """
            1.732
            2.000
            6.928
        """.trimIndent()

        val result = No11337().solve(given.reader().buffered())
        result shouldBe expected
    }
})
