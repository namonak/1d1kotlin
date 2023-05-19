package boj.problems.step13

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

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

        val actual = No10814.solve(BufferedReader(StringReader(given)))

        actual shouldBe expected
    }
})
