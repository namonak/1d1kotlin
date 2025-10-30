package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11586Test : StringSpec({
    "지영 공주님의 마법 거울 : https://www.acmicpc.net/problem/11586" {
        val given = """
            8
            OOOOOOOO
            OKKOOEEO
            OKKOOEEO
            OOOSSOOO
            OOOSSOOO
            OAOOOOAO
            OOAAAAOO
            OOOOOOOO
            3
        """.trimIndent()
        val expected = """
            OOOOOOOO
            OOAAAAOO
            OAOOOOAO
            OOOSSOOO
            OOOSSOOO
            OKKOOEEO
            OKKOOEEO
            OOOOOOOO
        """.trimIndent()

        val actual = No11586().solve(given.reader().buffered())
        actual shouldBe expected
    }
})
