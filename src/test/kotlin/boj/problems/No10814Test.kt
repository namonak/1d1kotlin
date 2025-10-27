package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10814Test : StringSpec({
    "나이순 정렬 : https://www.acmicpc.net/problem/10814" {
        val given = """
            3
            21 Junkyu
            21 Dohyun
            20 Sunyoung
        """.trimIndent()
        val expected = """
            20 Sunyoung
            21 Junkyu
            21 Dohyun
        """.trimIndent()

        No10814().solve(given.reader().buffered()) shouldBe expected
    }
})
