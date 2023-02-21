package boj.problems.step19

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class No10828Test : StringSpec({
    val path = File(".")
    val input = arrayOf(
        "No10828_input_1.txt",
        "No10828_input_2.txt"
    )

    val output = arrayOf(
        "No10828_output_1.txt",
        "No10828_output_2.txt"
    )

    "스택" {
        input.indices.forEach { i ->
            // given
            val given = File(path, "src/test/kotlin/boj/problems/step19/${input[i]}").bufferedReader()
            val expected = File(path, "src/test/kotlin/boj/problems/step19/${output[i]}").readText()

            // when
            val actual = No10828.solve(given)

            // then
            actual shouldBe expected
            given.close()
        }
    }
})
