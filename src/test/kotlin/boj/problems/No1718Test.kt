package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1718Test : StringSpec({
    "암호 : https://www.acmicpc.net/problem/1718" {
        val given = """
            nice day
            love
        """.trimIndent()
        val expected = "btgz oet"

        No1718().solve(given.reader().buffered()) shouldBe expected
    }
})
