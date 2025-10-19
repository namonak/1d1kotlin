package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No32326Test : StringSpec({
    "Conveyor Belt Sushi : https://www.acmicpc.net/problem/32326" {
        val given = """
            0
            2
            4
        """.trimIndent()
        val expected = "28"

        No32326().solve(given.reader().buffered()) shouldBe expected
    }
})
