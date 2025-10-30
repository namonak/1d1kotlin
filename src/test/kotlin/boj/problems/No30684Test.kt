package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30684Test : StringSpec({
    "모르고리즘 회장 정하기 : https://www.acmicpc.net/problem/30684" {
        val given = """
            7
            KGW
            LH
            AHC
            LKY
            DREAM
            AA
            KTY
        """.trimIndent()
        val expected = "AHC"

        No30684().solve(given.reader().buffered()) shouldBe expected
    }
})
