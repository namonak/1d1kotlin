package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31562Test : StringSpec({
    "전주 듣고 노래 맞히기 : https://www.acmicpc.net/problem/31562" {
        val given = """
            4 4
            11 TwinkleStar C C G G A A G
            8 Marigold E D E F E E D
            23 DoYouWannaBuildASnowMan C C C G C E D
            12 Cprogramming C C C C C C C
            E D E
            C G G
            C C C
            C C G
        """.trimIndent()
        val expected = """
            Marigold
            !
            ?
            TwinkleStar
        """.trimIndent()

        No31562().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
