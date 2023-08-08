package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1991Test : StringSpec({
    "No1991Test" {
        val given = """
            7
            A B C
            B D .
            C E F
            E . .
            F . G
            D . .
            G . .
        """.trimIndent()
        val expected = """
            ABDCEFG
            DBAECFG
            DBEGFCA
        """.trimIndent()

        No1991.solve(BufferedReader(given.reader())) shouldBe expected
    }
})
