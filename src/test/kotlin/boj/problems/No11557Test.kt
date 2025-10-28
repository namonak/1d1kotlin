package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11557Test : StringSpec({
    "Yangjojang of The Year : https://www.acmicpc.net/problem/11557" {
        val given = """
            2
            3
            Yonsei 10
            Korea 10000000
            Ewha 20
            2
            Yonsei 1
            Korea 10000000
        """.trimIndent()
        val expected = """
            Korea
            Korea
        """.trimIndent()

        No11557().solve(given.reader().buffered()) shouldBe expected
    }
})
