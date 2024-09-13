package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No6550Test : StringSpec({
    "부분 문자열 : https://www.acmicpc.net/problem/6550" {
        val given = """
            sequence subsequence
            person compression
            VERDI vivaVittorioEmanueleReDiItalia
            caseDoesMatter CaseDoesMatter
        """.trimIndent()
        val expected = """
            Yes
            No
            Yes
            No
        """.trimIndent()

        No6550().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
