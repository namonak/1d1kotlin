package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9612Test : StringSpec({
    "Maximum Word Frequency : https://www.acmicpc.net/problem/9612" {
        val given = """
            10
            mountain
            lake
            lake
            zebra
            tree
            lake
            zebra
            zebra
            animal
            lakes
        """.trimIndent()
        val expected = "zebra 3"

        No9612().solve(given.reader().buffered()) shouldBe expected
    }
})
