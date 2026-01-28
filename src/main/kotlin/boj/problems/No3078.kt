package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque
import java.util.StringTokenizer

class No3078 {
    fun solve(input: BufferedReader): String {
        val headerToken = StringTokenizer(input.readLine())
        val totalStudents = headerToken.nextToken().toInt()
        val maxRankDifference = headerToken.nextToken().toInt()
        val slidingWindow = ArrayDeque<Int>()
        val lengthFrequency = IntArray(MAX_NAME_LENGTH_CAPACITY)

        var goodFriendPairsCount: Long = 0

        repeat(totalStudents) {
            val currentNameLength = input.readLine().trim().length

            // [Step 1] 윈도우 범위 유지 (Sliding Window)
            // 현재 학생을 추가했을 때 등수 차이가 K를 초과하게 되는 가장 앞의 학생(Oldest)을 제거
            if (slidingWindow.size > maxRankDifference) {
                val rankOverStudentLength = slidingWindow.pollFirst() // == removeFirst()
                lengthFrequency[rankOverStudentLength]--
            }

            // [Step 2] 정답 집계
            // 현재 윈도우(유효 범위) 안에 나와 이름 길이가 같은 학생이 몇 명인지 확인
            goodFriendPairsCount += lengthFrequency[currentNameLength]

            // [Step 3] 현재 학생을 윈도우에 등록
            slidingWindow.offerLast(currentNameLength) // == addLast()
            lengthFrequency[currentNameLength]++
        }

        return goodFriendPairsCount.toString()
    }

    companion object {
        // 이름의 최대 길이는 20글자이므로, 인덱스 0~20을 커버하기 위해 21 크기 할당
        private const val MAX_NAME_LENGTH_CAPACITY = 21
    }
}
