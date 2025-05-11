package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No13414Test : StringSpec({
    "수강신청 : https://www.acmicpc.net/problem/13414" {
        val given = """
            3 8
            20103324
            20133221
            20133221
            20093778
            20140101
            01234567
            20093778
            20103325
        """.trimIndent()
        val expected = """
            20103324
            20133221
            20140101
        """.trimIndent()

        No13414().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
