package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31009Test : StringSpec({
    "진주로 가자! (Easy) : https://www.acmicpc.net/problem/31009" {
        val given = """
            5
            changwon 100
            incheon 70
            jinju 90
            haenam 530
            gangneung 660
        """.trimIndent()
        val expected = """
            90
            3
        """.trimIndent()

        No31009().solve(given.reader().buffered()) shouldBe expected
    }
})
