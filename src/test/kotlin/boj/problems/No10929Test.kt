package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10929Test : StringSpec({
    "SHA-224 : https://www.acmicpc.net/problem/10929" {
        val given = "Baekjoon"
        val expected = "880ceaa24e932e5c19350adc50535922ead12ba689a7a6a9a895d2ce"

        No10929().solve(given.reader().buffered()) shouldBe expected
    }
})
