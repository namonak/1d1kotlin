package boj.problems.step19

import boj.problems.step19.No10828.solve
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.nio.file.Files

internal class No10828Test {
    private var path = File(".")
    private var input = arrayOfNulls<String>(TESTCASE_NUM)
    private var output = arrayOfNulls<String>(TESTCASE_NUM)
    @Test
    @DisplayName("스택")
    @Throws(IOException::class)
    fun test() {
        println("스택 : https://www.acmicpc.net/problem/10828")
        input[0] = path.absolutePath + "/src/test/java/boj/problems/step19/No10828_input_1.txt"
        output[0] = path.absolutePath + "/src/test/java/boj/problems/step19/No10828_output_1.txt"
        input[1] = path.absolutePath + "/src/test/java/boj/problems/step19/No10828_input_2.txt"
        output[1] = path.absolutePath + "/src/test/java/boj/problems/step19/No10828_output_2.txt"
        for (i in 0 until TESTCASE_NUM) {
            // given
            val given = BufferedReader(FileReader(input[i]))
            val expected = String(Files.readAllBytes(File(output[i]).toPath()))

            // when
            val actual = solve(given)

            // then
            Assertions.assertEquals(expected, actual)
            given.close()
        }
    }

    companion object {
        const val TESTCASE_NUM = 2
    }
}
