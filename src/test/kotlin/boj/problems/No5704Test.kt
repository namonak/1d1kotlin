package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5704Test : StringSpec({
    "팬그램 : https://www.acmicpc.net/problem/5704" {
        val given = """
            jackdawf loves my big quartz sphinx
            abcdefghijklmnopqrstuvwxyz
            hello world
            *
        """.trimIndent()
        val expected = """
            Y
            Y
            N
        """.trimIndent()

        No5704().solve(given.reader().buffered()) shouldBe expected
    }
})
