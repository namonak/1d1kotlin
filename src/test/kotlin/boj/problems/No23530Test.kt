package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import kotlin.random.Random

private const val C_MIN = 1
private const val C_MAX = 50

class No23530Test : StringSpec({
    fun buildInput(pairs: List<Pair<Int, Int>>): String =
        buildString {
            appendLine(pairs.size) // t
            pairs.forEach { (a, b) -> appendLine("$a $b") }
        }

    fun parseOutput(out: String): List<Int> =
        out.lineSequence()
            .map(String::trim)
            .filter(String::isNotEmpty)
            .map(String::toInt)
            .toList()

    fun assertNotAPlusB(
        pairs: List<Pair<Int, Int>>,
        out: String
    ) {
        val cs = parseOutput(out)
        cs shouldHaveSize pairs.size // 줄 수가 t와 같아야 함
        for (i in pairs.indices) {
            val (a, b) = pairs[i]
            val c = cs[i]
            (c in C_MIN..C_MAX) shouldBe true // 1 ≤ c ≤ 50
            c shouldNotBe a + b // c ≠ a + b
        }
    }

    "샘플 유사 케이스: '값 동일성'이 아니라 '조건'을 검증한다" {
        val pairs = listOf(1 to 2, 3 to 4, 5 to 6)
        val given = buildInput(pairs)
        val out = No23530().solve(given.reader().buffered())
        assertNotAPlusB(pairs, out)
    }

    "랜덤 케이스(제한 범위 내에서 여러 쌍 검증)" {
        val rng = Random(1234)
        val pairs = List(100) { rng.nextInt(1, 51) to rng.nextInt(1, 51) }
        val given = buildInput(pairs)
        val out = No23530().solve(given.reader().buffered())
        assertNotAPlusB(pairs, out)
    }

    "경계값 케이스(합이 최소·최대 근처)" {
        val pairs = listOf(1 to 1, 50 to 50, 1 to 50, 2 to 49)
        val given = buildInput(pairs)
        val out = No23530().solve(given.reader().buffered())
        assertNotAPlusB(pairs, out)
    }
})
