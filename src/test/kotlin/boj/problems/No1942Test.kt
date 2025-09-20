package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1942Test : StringSpec({
    "디지털시계 : https://www.acmicpc.net/problem/1942" {
        val given = """
            00:59:58 01:01:24
            22:47:03 01:03:24
            00:00:09 00:03:37
        """.trimIndent()
        val expected = """
            29
            2727
            70
        """.trimIndent()

        val result = No1942().solve(given.reader().buffered())
        result shouldBe expected
    }
})
