package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs

class No2987 {
    /**
     * 좌표를 나타내는 Value Object
     */
    private data class Point(val x: Int, val y: Int)

    /**
     * 삼각형의 기하학적 로직을 캡슐화한 도메인 클래스
     */
    private class Triangle(val a: Point, val b: Point, val c: Point) {
        // 삼각형의 넓이는 생성 시점이 아닌 필요할 때 계산 (Lazy Evaluation)
        val area: Double by lazy { calculateArea(a, b, c) }

        /**
         * 점 p가 삼각형 내부에(또는 경계에) 있는지 판별하는 메서드
         * 원리: (전체 넓이) == (p를 포함한 3개 부분 삼각형의 넓이 합)
         */
        fun contains(p: Point): Boolean {
            val subAreaSum = calculateArea(p, a, b) +
                calculateArea(p, b, c) +
                calculateArea(p, c, a)

            // 부동소수점 오차를 고려한 비교 (Epsilon comparison)
            return abs(area - subAreaSum) < 1e-9
        }

        /**
         * 세 점을 이용한 삼각형 넓이 계산 (신발끈 공식)
         * 순수 함수 형태로 구현하여 부작용 방지
         */
        private fun calculateArea(
            p1: Point,
            p2: Point,
            p3: Point
        ): Double {
            val term = p1.x * (p2.y - p3.y) +
                p2.x * (p3.y - p1.y) +
                p3.x * (p1.y - p2.y)
            return abs(term) / 2.0
        }
    }

    fun solve(input: BufferedReader): String {
        // 1. 입력 파싱: 삼각형의 세 꼭짓점
        val p1 = parsePoint(input.readLine())
        val p2 = parsePoint(input.readLine())
        val p3 = parsePoint(input.readLine())

        val land = Triangle(p1, p2, p3)

        // 2. 입력 파싱: 사과나무 개수
        val n = input.readLine().toInt()

        // 3. 비즈니스 로직 수행 (내부의 나무 개수 세기)
        var count = 0
        repeat(n) {
            val treeLocation = parsePoint(input.readLine())
            if (land.contains(treeLocation)) {
                count++
            }
        }

        // 4. 결과 포맷팅
        return buildString {
            append(String.format("%.1f", land.area))
            append("\n")
            append(count)
        }
    }

    // 입력 문자열을 Point 객체로 변환하는 헬퍼 함수
    private fun parsePoint(line: String): Point {
        val tokenizer = StringTokenizer(line)
        return Point(
            x = tokenizer.nextToken().toInt(),
            y = tokenizer.nextToken().toInt()
        )
    }
}
