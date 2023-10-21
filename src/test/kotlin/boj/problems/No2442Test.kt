package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2442Test : StringSpec({
    "별 찍기 - 5 : https://www.acmicpc.net/problem/2442" {
        val given = 5
        val expected = """
    *
   ***
  *****
 *******
*********
        """.trimIndent()

        No2442.solve(given) shouldBe expected
    }
})
