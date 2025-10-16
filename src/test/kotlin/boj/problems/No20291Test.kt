package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No20291Test : StringSpec({
    "파일 정리 : https://www.acmicpc.net/problem/20291" {
        val given = """
            8
            sbrus.txt
            spc.spc
            acm.icpc
            korea.icpc
            sample.txt
            hello.world
            sogang.spc
            example.txt
        """.trimIndent()
        val expected = """
            icpc 2
            spc 2
            txt 3
            world 1
        """.trimIndent()

        No20291().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
