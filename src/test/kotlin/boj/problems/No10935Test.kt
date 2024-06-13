package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10935Test : StringSpec({
    "BASE64 인코딩 : https://www.acmicpc.net/problem/10935" {
        val given = "Baekjoon"
        val expected = "QmFla2pvb24="

        No10935().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
