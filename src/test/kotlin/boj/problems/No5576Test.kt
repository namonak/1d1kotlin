package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No5576Test : StringSpec({
    "콘테스트 : https://www.acmicpc.net/problem/5576" {
        val testCases = listOf(
            "23\n23\n20\n15\n15\n14\n13\n9\n7\n6\n25\n19\n17\n17\n16\n13\n12\n11\n9\n5" to "66 61",
            "17\n25\n23\n25\n79\n29\n1\n61\n59\n100\n44\n74\n94\n57\n13\n54\n82\n0\n42\n45" to "240 250"
        )

        testCases.forEach { (input, output) ->
            val actual = No5576.solve(BufferedReader(input.reader()))
            actual shouldBe output
        }
    }
})
