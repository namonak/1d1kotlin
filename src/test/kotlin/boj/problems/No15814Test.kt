package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15814Test : StringSpec({
    "야바위 대장 : https://www.acmicpc.net/problem/15814" {
        val given = """
            Youngmaan-good
            2
            1 3
            9 2
        """.trimIndent()
        val expected = "Yn-ogmaanugood"

        No15814().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
