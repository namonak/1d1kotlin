package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No13163Test : StringSpec({
    "닉네임에 갓 붙이기 : https://www.acmicpc.net/problem/13163" {
        val given = """
            5
            baek joon
            koo sa ga
            ac ka
            yu ka ri ko
            ke sa ki yo
        """.trimIndent()
        val expected = """
            godjoon
            godsaga
            godka
            godkariko
            godsakiyo
        """.trimIndent()

        No13163().solve(given.reader().buffered()) shouldBe expected
    }
})
