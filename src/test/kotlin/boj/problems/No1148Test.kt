package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1148Test : StringSpec({
    "단어 만들기 : https://www.acmicpc.net/problem/1148" {
        val given = """
            APPLE
            BANANA
            BANE
            BRILLIANT
            LINT
            PALE
            PROBLEM
            TILL
            TRILL
            -
            LARBITNLI
            LEPAPBNNA
            LEPAPBNAM
            #
        """.trimIndent()
        val expected = """
            AB 1 ILT 4
            BN 1 AE 3
            M 0 AE 3
        """.trimIndent()

        No1148().solve(given.reader().buffered()) shouldBe expected
    }
})
