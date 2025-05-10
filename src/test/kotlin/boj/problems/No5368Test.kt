package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5368Test : StringSpec({
    "Escape Route : https://www.acmicpc.net/problem/5368" {
        val given = """
            2
            4
            -wp-
            s--w
            -w-p
            -pw-
            5
            s--wp
            w--pw
            -w-p-
            p--wp
            w--pw
        """.trimIndent()
        val expected = """
            (1,0):(0,2):2.24
            (0,0):(3,0):3.00
        """.trimIndent()

        No5368().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
