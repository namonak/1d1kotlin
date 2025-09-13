package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27522Test : StringSpec({
    "카트라이더: 드리프트 : https://www.acmicpc.net/problem/27522" {
        val given = """
            1:52:682 B
            1:50:201 R
            1:49:003 B
            1:49:735 B
            1:50:257 R
            1:51:134 R
            1:49:236 R
            1:53:932 B
        """.trimIndent()
        val expected = "Red"

        val result = No27522().solve(given.reader().buffered())
        result shouldBe expected
    }
})
