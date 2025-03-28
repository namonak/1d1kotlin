package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No10431Test : StringSpec({
    "줄세우기  : https://www.acmicpc.net/problem/10431" {
        val given = """
            4
            1 900 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919
            2 919 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900
            3 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919 900
            4 918 917 916 915 914 913 912 911 910 909 908 907 906 905 904 903 902 901 900 919
        """.trimIndent()
        val expected = """
            1 0
            2 190
            3 19
            4 171
        """.trimIndent()

        No10431().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
