package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No17413Test : StringSpec({
    "단어 뒤집기 2 : https://www.acmicpc.net/problem/17413" {
        val given = """
            <ab cd>ef gh<ij kl>
        """.trimIndent()
        val expected = """
            <ab cd>fe hg<ij kl>
        """.trimIndent()

        No17413.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
