package boj.problems.step5

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.InputStreamReader

class No11718Test : StringSpec({
    "그대로 출력하기 : https://www.acmicpc.net/problem/11718" {
        // given
        val given = "Hello\nBaekjoon\nOnline Judge"
        val expected = "Hello\nBaekjoon\nOnline Judge"

        // when
        val actual = No11718.solve(BufferedReader(InputStreamReader(given.byteInputStream())))

        // then
        actual shouldBe expected
    }
})
