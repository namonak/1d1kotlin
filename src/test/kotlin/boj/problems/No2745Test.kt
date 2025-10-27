package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2745Test : StringSpec({
    "진법 변환 : https://www.acmicpc.net/problem/2745" {
        val given = "ZZZZZ 36"
        val expected = "60466175"

        No2745().solve(given.reader().buffered()) shouldBe expected
    }
})
