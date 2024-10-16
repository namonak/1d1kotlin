package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No3622Test : StringSpec({
    "어떤 호박의 할로윈 여행 : https://www.acmicpc.net/problem/3622" {
        val given = "2 1 5 3 6"
        val expected = "Yes"

        No3622().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
