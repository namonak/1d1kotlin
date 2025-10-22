package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16165Test : StringSpec({
    "걸그룹 마스터 준석이 : https://www.acmicpc.net/problem/16165" {
        val given = """
            3 4
            twice
            9
            jihyo
            dahyeon
            mina
            momo
            chaeyoung
            jeongyeon
            tzuyu
            sana
            nayeon
            blackpink
            4
            jisu
            lisa
            rose
            jenny
            redvelvet
            5
            wendy
            irene
            seulgi
            yeri
            joy
            sana
            1
            wendy
            1
            twice
            0
            rose
            1
        """.trimIndent()
        val expected = """
            twice
            redvelvet
            chaeyoung
            dahyeon
            jeongyeon
            jihyo
            mina
            momo
            nayeon
            sana
            tzuyu
            blackpink
        """.trimIndent()

        No16165().solve(given.reader().buffered()) shouldBe expected
    }
})
