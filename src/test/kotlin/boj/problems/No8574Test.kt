package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No8574Test : StringSpec({
    "Ratownik : https://www.acmicpc.net/problem/8574" {
        val given = """
            5 3 2 2
            2 4
            2 6
            3 3
            4 2
            5 6
        """.trimIndent()
        val expected = "2"

        No8574().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
