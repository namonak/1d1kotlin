package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14568Test : StringSpec({
    "2017 연세대학교 프로그래밍 경시대회 : https://www.acmicpc.net/problem/14568" {
        val given = "6"
        val expected = "1"

        No14568().solve(given.reader().buffered()) shouldBe expected
    }
})
