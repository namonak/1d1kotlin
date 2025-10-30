package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15727Test : StringSpec({
    "조별과제를 하려는데 조장이 사라졌다 : https://www.acmicpc.net/problem/15727" {
        val given = "12"
        val expected = "3"

        No15727().solve(given.reader().buffered()) shouldBe expected
    }
})
