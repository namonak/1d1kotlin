package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11942Test : StringSpec({
    "고려대는 사랑입니다 : https://www.acmicpc.net/problem/11942" {
        val expected = "고려대학교"

        No11942().solve() shouldBe expected
    }
})
