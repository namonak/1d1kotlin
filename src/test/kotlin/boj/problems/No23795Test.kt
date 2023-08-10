package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No23795Test : StringSpec({
    "사장님 도박은 재미로 하셔야 합니다 : https://www.acmicpc.net/problem/23795" {
        val given = """
            1
            2
            3
            4
            5
            6
            7
            8
            9
            10
            -1
        """.trimIndent()
        val expected = 55

        No23795.solve(BufferedReader(given.reader())) shouldBe expected
    }
})
