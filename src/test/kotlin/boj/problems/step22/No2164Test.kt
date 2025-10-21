package boj.problems.step22

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2164Test : StringSpec({
    "카드2 : https://www.acmicpc.net/problem/2164" {
        val given = "6"
        val expected = "4"

        No2164().solve(given.reader().buffered()) shouldBe expected
    }
})
