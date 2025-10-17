package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2161Test : StringSpec({
    "카드1 : https://www.acmicpc.net/problem/2161" {
        val given = "7"
        val expected = "1 3 5 7 4 2 6"

        val actual = No2161().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
