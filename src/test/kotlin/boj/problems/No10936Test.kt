package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10936Test : StringSpec({
    "BASE64 디코딩 : https://www.acmicpc.net/problem/10936" {
        val given = "QmFla2pvb24="
        val expected = "Baekjoon"

        No10936().solve(given.reader().buffered()) shouldBe expected
    }
})
