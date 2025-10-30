package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11945Test : StringSpec({
    "뜨거운 붕어빵 : https://www.acmicpc.net/problem/11945" {
        val given = """
            5 7
            0010000
            0111010
            1111111
            0111010
            0010000
        """.trimIndent()
        val expected = """
            0000100
            0101110
            1111111
            0101110
            0000100
        """.trimIndent()

        No11945().solve(given.reader().buffered()) shouldBe expected
    }
})
