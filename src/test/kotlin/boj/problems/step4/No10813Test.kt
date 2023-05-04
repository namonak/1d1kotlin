package boj.problems.step4

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class No10813Test : StringSpec({
    "공 바꾸기 : https://www.acmicpc.net/problem/10813" {
        // given
        val given = File("src/test/kotlin/boj/problems/step4/No10813_input.txt").bufferedReader()
        val expected = File("src/test/kotlin/boj/problems/step4/No10813_output.txt").readText()

        // when
        val actual = No10813.solve(given)

        // then
        actual shouldBe expected
    }
})
