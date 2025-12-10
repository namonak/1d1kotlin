package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5365Test : StringSpec({
    "Decoder : https://www.acmicpc.net/problem/5365" {
        val given = """
            10
            Give Solo a total Naboo map DEV reject bateau German
        """.trimIndent()
        val expected = "Go to Vjun"

        No5365().solve(given.reader().buffered()) shouldBe expected
    }
})
