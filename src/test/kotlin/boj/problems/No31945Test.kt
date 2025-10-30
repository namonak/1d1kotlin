package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31945Test : StringSpec({
    "정육면체의 네 꼭짓점 : https://www.acmicpc.net/problem/31945" {
        val given = """
            2
            5 0 4 1
            1 2 6 5
        """.trimIndent()
        val expected = """
            YES
            NO
        """.trimIndent()

        No31945().solve(given.reader().buffered()) shouldBe expected
    }
})
