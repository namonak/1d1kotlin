package boj.problems.step13

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1181Test : StringSpec({
    "단어 정렬 : https://www.acmicpc.net/problem/1181" {
        val given = """
            13
            but
            i
            wont
            hesitate
            no
            more
            no
            more
            it
            cannot
            wait
            im
            yours
        """.trimIndent()
        val expected = """
            i
            im
            it
            no
            but
            more
            wait
            wont
            yours
            cannot
            hesitate
        """.trimIndent()

        val actual = No1181().solve(BufferedReader(StringReader(given)))

        actual shouldBe expected
    }
})
