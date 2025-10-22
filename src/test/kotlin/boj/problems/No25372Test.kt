package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25372Test : StringSpec({
    "성택이의 은밀한 비밀번호 : https://www.acmicpc.net/problem/25372" {
        val given = """
            3
            1245125
            asdij
            120318739721
        """.trimIndent()
        val expected = """
            yes
            no
            no
        """.trimIndent()

        No25372().solve(given.reader().buffered()) shouldBe expected
    }
})
