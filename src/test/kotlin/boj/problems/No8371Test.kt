package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8371Test : StringSpec({
    "Dyslexia : https://www.acmicpc.net/problem/8371" {
        val given = """
            21
            JASIOJESTDYSLEKTYKIEM
            JAsIOJSSTDXSIEKTYKLEM
        """.trimIndent()
        val expected = "5"

        No8371().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
