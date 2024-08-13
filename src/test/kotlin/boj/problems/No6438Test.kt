package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No6438Test : StringSpec({
    "Reverse Text : https://www.acmicpc.net/problem/6438" {
        val given = """
            3
            Frankly, I don't think we'll make much
            money out of this scheme.
            madam I'm adam
        """.trimIndent()

        val expected = """
            hcum ekam ll'ew kniht t'nod I ,ylknarF
            .emehcs siht fo tuo yenom
            mada m'I madam
        """.trimIndent()

        No6438().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
