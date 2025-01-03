package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No4583Test : StringSpec({
    "거울상 : https://www.acmicpc.net/problem/4583" {
        val given = """
            boowxod
            bidi
            bed
            bbb
            #
        """.trimIndent()
        val expected = """
            boxwood
            ibid
            INVALID
            ddd
        """.trimIndent()

        No4583().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
