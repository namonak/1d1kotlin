package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No1015 {
    private data class Element(val value: Int, val originalIndex: Int) : Comparable<Element> {
        override fun compareTo(other: Element): Int {
            if (this.value != other.value) {
                return this.value - other.value
            }
            return this.originalIndex - other.originalIndex
        }
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val st = StringTokenizer(input.readLine())
        val elements = ArrayList<Element>(n)

        for (i in 0 until n) {
            if (st.hasMoreTokens()) {
                val value = st.nextToken().toInt()
                elements.add(Element(value, i))
            }
        }

        // Element 클래스에서 정의한 compareTo 규칙에 따라 정렬
        elements.sort()

        // 결과 배열 P 생성 및 매핑
        // P[i]는 원래 배열 A[i]가 정렬된 배열 B에서 몇 번째 위치(rank)인지를 나타냄
        val p = IntArray(n)

        for (rank in 0 until n) {
            val element = elements[rank]
            // 정렬된 리스트의 rank번째 요소(element)의 원래 위치(originalIndex)에 현재의 등수(rank)를 기록
            p[element.originalIndex] = rank
        }

        return p.joinToString(" ")
    }
}
