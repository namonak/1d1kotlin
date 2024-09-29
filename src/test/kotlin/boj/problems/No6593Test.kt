package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No6593Test : StringSpec({
    "상범 빌딩 : https://www.acmicpc.net/problem/6593" {
        val given = """
            3 4 5
            S....
            .###.
            .##..
            ###.#

            #####
            #####
            ##.##
            ##...

            #####
            #####
            #.###
            ####E

            1 3 3
            S##
            #E#
            ###

            0 0 0
        """.trimIndent()
        val expected = """
            Escaped in 11 minute(s).
            Trapped!
        """.trimIndent()

        No6593().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
