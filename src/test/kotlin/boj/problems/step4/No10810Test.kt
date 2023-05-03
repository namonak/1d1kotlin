package boj.problems.step4

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class No10810Test : StringSpec({
    "공 넣기 : https://www.acmicpc.net/problem/10810" {
        // given
        val given = File("src/test/kotlin/boj/problems/step4/No10810_input.txt").bufferedReader()
        val expected = File("src/test/kotlin/boj/problems/step4/No10810_output.txt").readText()

        // when
        val actual = No10810.solve(given)

        // then
        actual shouldBe expected
    }
})
