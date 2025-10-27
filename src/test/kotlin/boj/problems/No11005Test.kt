package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11005Test : StringSpec({
    "진법 변환 2 : https://www.acmicpc.net/problem/11005" {
        val given = "60466175 36"
        val expected = "ZZZZZ"

        No11005().solve(given.reader().buffered()) shouldBe expected
    }
})
