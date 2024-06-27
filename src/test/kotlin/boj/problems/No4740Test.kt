package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4740Test : StringSpec({
    "거울, 오! 거울 : https://www.acmicpc.net/problem/4740" {
        val given = """
            AMBULANCE
            Evian
            madam, i'm adam
            ***
        """.trimIndent()
        val expected = """
            ECNALUBMA
            naivE
            mada m'i ,madam
        """.trimIndent()

        No4740().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
