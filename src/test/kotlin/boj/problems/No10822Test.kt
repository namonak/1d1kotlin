package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10822Test : StringSpec({
    "더하기 : https://www.acmicpc.net/problem/10822" {
        val given = "10,20,30,50,100"
        val expected = 210

        No10822.solve(given) shouldBe expected
    }
})
