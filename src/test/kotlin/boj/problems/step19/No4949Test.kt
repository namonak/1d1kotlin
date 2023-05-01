package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class No4949Test : StringSpec({
    "균형잡힌 세상 테스트" {
        println("균형잡힌 세상 : https://www.acmicpc.net/problem/4949")

        // given
        val given = File("src/test/kotlin/boj/problems/step19/No4949_input.txt").bufferedReader()
        val expected = File("src/test/kotlin/boj/problems/step19/No4949_output.txt").readText()

        // when
        val actual = No4949.solve(given)

        // then
        actual shouldBe expected
    }
})
