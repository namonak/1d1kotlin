package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2589Test : StringSpec({
    "보물섬 : https://www.acmicpc.net/problem/2589 " {
        val given = """
            5 7
            WLLWWWL
            LLLWLLL
            LWLWLWW
            LWLWLLL
            WLLWLWW
        """.trimIndent()
        val expected = "8"

        No2589().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
