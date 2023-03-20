package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.File

class No10828Test : StringSpec({
    "스택" {
        val path = File(".")

        val testCases = listOf(
            row("No10828_input_1.txt", "No10828_output_1.txt"),
            row("No10828_input_2.txt", "No10828_output_2.txt")
        )

        testCases.forEach { (input, output) ->
            // given
            val given = File(path, "src/test/kotlin/boj/problems/step19/$input").bufferedReader()
            val expected = File(path, "src/test/kotlin/boj/problems/step19/$output").readText()

            // when
            val actual = No10828.solve(given)

            // then
            actual shouldBe expected
            given.close()
        }
    }
})
