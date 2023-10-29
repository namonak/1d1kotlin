package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11723Test : StringSpec({
    "집합 : https://www.acmicpc.net/problem/11723" {
        val given = """
            26
            add 1
            add 2
            check 1
            check 2
            check 3
            remove 2
            check 1
            check 2
            toggle 3
            check 1
            check 2
            check 3
            check 4
            all
            check 10
            check 20
            toggle 10
            remove 20
            check 10
            check 20
            empty
            check 1
            toggle 1
            check 1
            toggle 1
            check 1
        """.trimIndent()

        val expected = """
            1
            1
            0
            1
            0
            1
            0
            1
            0
            1
            1
            0
            0
            0
            1
            0
        """.trimIndent()

        No11723.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
