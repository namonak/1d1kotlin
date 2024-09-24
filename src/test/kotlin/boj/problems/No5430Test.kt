package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5430Test : StringSpec({
    "AC : https://www.acmicpc.net/problem/5430" {
        val given = """
            4
            RDD
            4
            [1,2,3,4]
            DD
            1
            [42]
            RRD
            6
            [1,1,2,3,5,8]
            D
            0
            []
        """.trimIndent()
        val expected = """
            [2,1]
            error
            [1,2,3,5,8]
            error
        """.trimIndent()

        No5430().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
