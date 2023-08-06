package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16212Test : StringSpec({
    "정열적인 정렬 : https://www.acmicpc.net/problem/16212" {
        val given = "6\n14 5 8 7 1 10"
        val expected = "1 5 7 8 10 14"

        No16212.solve(BufferedReader(given.reader())) shouldBe expected
    }
})
