package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1251Test : StringSpec({
    "단어 나누기 : https://www.acmicpc.net/problem/1251" {
        val given = "mobitel"
        val expected = "bometil"

        No1251().solve(given.reader().buffered()) shouldBe expected
    }
})
