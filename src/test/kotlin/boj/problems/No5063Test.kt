package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5063Test : StringSpec({
    "TGN : https://www.acmicpc.net/problem/5063" {
        val given = """
            3
            0 100 70
            100 130 30
            -100 -70 40
        """.trimIndent()
        val expected = """
            advertise
            does not matter
            do not advertise
        """.trimIndent()

        No5063().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
