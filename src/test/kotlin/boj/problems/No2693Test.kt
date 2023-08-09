package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2693Test : StringSpec({
    "N번째 큰 수 : https://www.acmicpc.net/problem/2693" {
        val given = """
        4
        1 2 3 4 5 6 7 8 9 1000
        338 304 619 95 343 496 489 116 98 127
        931 240 986 894 826 640 965 833 136 138
        940 955 364 188 133 254 501 122 768 408
        """.trimIndent()
        val expected = """
        8
        489
        931
        768
        """.trimIndent()

        No2693.solve(BufferedReader(given.reader())) shouldBe expected
    }
})
