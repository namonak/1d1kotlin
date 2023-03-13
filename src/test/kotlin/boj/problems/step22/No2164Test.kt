package boj.problems.step22

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2164Test : StringSpec({
    "카드2" {
        // given, when
        val actual = No2164.solve(6)

        // then
        actual shouldBe 4
    }
})
