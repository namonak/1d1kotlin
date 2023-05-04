package boj.problems.step4

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class No10811Test : StringSpec({
    "바구니 뒤집기 : https://www.acmicpc.net/problem/10811" {
        // given
        val given = File("src/test/kotlin/boj/problems/step4/No10811_input.txt").bufferedReader()
        val expected = File("src/test/kotlin/boj/problems/step4/No10811_output.txt").readText()

        // when
        val actual = No10811.solve(given)

        // then
        actual shouldBe expected
    }
})
