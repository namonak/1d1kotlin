package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11719Test : StringSpec({
    "그대로 출력하기 2 : https://www.acmicpc.net/problem/11719" {
        val given = "    Hello\nBaekjoon\n    Online Judge"
        val expected = "    Hello\nBaekjoon\n    Online Judge"

        val actual = No11719.solve(given)

        actual shouldBe expected
    }
})
