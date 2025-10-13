package boj.problems

import java.io.BufferedReader

private const val MOD = 1000

/**
 * 행렬을 래핑하는 데이터 클래스
 * @property data 실제 N×N 크기의 2차원 배열
 */
data class Matrix(private val data: Array<IntArray>) {
    val size: Int = data.size

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Matrix) return false
        return data.contentDeepEquals(other.data)
    }

    override fun hashCode(): Int = data.contentDeepHashCode()

    /**
     * 행렬 곱셈 연산자 오버로딩 (O(n^3))
     * 각 곱셈 및 덧셈 단계에서 모듈로 연산을 적용해 값이 커지는 것을 방지합니다.
     */
    operator fun times(other: Matrix): Matrix {
        val n = size
        val result = Array(n) { IntArray(n) }

        for (i in 0 until n) {
            for (j in 0 until n) {
                var sum = 0
                for (k in 0 until n) {
                    sum = (sum + data[i][k] * other.data[k][j]) % MOD
                }
                result[i][j] = sum
            }
        }
        return Matrix(result)
    }

    /**
     * 분할정복을 활용한 행렬 거듭제곱
     * @param exponent 지수 B (>=1)
     * @return this^exponent
     * 시간 복잡도: O(n^3 · log B)
     */
    fun pow(exponent: Long): Matrix {
        require(exponent >= 1) { "지수는 1 이상이어야 합니다." }
        return when {
            exponent == 1L -> this
            exponent % 2 == 0L -> {
                val half = pow(exponent / 2)
                half * half
            }
            else -> {
                val half = pow(exponent / 2)
                half * half * this
            }
        }
    }

    /**
     * 결과를 출력 형식으로 변환
     * 각 행마다 공백으로 구분된 숫자 문자열로 변환하고, 줄 바꿈을 추가합니다.
     */
    fun toOutputString(): String {
        val sb = StringBuilder()
        for (row in data) {
            sb.append(row.joinToString(" ")).append('\n')
        }
        return sb.toString()
    }
}

class No10830 {
    fun solve(input: BufferedReader): String {
        // 1) 첫째 줄에서 N(행렬 크기)과 B(거듭제곱 횟수)를 읽어옵니다.
        val (n, b) = input.readLine().split(" ").let { it[0].toInt() to it[1].toLong() }

        // 2) 다음 N줄에 걸쳐 행렬 원소를 읽어와 Matrix로 래핑합니다.
        val matrixData = Array(n) { IntArray(n) }
        repeat(n) { i ->
            input.readLine().split(" ").forEachIndexed { j, v ->
                matrixData[i][j] = v.toInt() % MOD
            }
        }
        val a = Matrix(matrixData)

        // 3) 분할정복을 이용해 A^B를 계산
        val result = a.pow(b)

        // 4) 결과를 문자열로 변환해 반환
        return result.toOutputString().trimEnd()
    }
}
