package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11478Test : StringSpec({
    "서로 다른 부분 문자열의 개수 : https://www.acmicpc.net/problem/11478" {
        val given = "ababc"
        val expected = "12"

        No11478().solve(given.reader().buffered()) shouldBe expected
    }
})
