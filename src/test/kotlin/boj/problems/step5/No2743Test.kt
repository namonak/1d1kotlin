package boj.problems.step5

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.InputStreamReader

class No2743Test : StringSpec({
    "단어 길이 재기 : https://www.acmicpc.net/problem/2743" {
        // given
        val given = "pulljima"
        val expected = "8"

        // when
        val actual = No2743.solve(BufferedReader(InputStreamReader(given.byteInputStream())))

        // then
        actual shouldBe expected
    }
})
