package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10821Test : StringSpec({
    "정수의 개수 : https://www.acmicpc.net/problem/10821" {
        val given = "10,20,30,50,100"
        val expected = 5

        val actual = No10821.solve(given)

        actual shouldBe expected
    }
})
