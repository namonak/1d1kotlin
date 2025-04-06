package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15667Test : StringSpec({
    "2018 연세대학교 프로그래밍 경진대회 : https://www.acmicpc.net/problem/15667" {
        val given = "21"
        val expected = "4"

        No15667().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
