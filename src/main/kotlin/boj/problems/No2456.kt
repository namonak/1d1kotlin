package boj.problems

import java.io.BufferedReader

class No2456 {
    fun solve(input: BufferedReader): String {
        // 입력
        val n = input.readLine().toInt()

        // 각 후보의 총점
        val scores = IntArray(3)
        // 각 후보가 받은 3점, 2점, 1점 횟수
        val cnt3 = IntArray(3)
        val cnt2 = IntArray(3)
        val cnt1 = IntArray(3)

        repeat(n) {
            // 한 줄에 후보1, 후보2, 후보3이 받은 점수가 주어짐
            val (s1, s2, s3) = input.readLine().split(" ").map { it.toInt() }

            // 후보1
            scores[0] += s1
            when (s1) {
                3 -> cnt3[0]++
                2 -> cnt2[0]++
                1 -> cnt1[0]++
            }
            // 후보2
            scores[1] += s2
            when (s2) {
                3 -> cnt3[1]++
                2 -> cnt2[1]++
                1 -> cnt1[1]++
            }
            // 후보3
            scores[2] += s3
            when (s3) {
                3 -> cnt3[2]++
                2 -> cnt2[2]++
                1 -> cnt1[2]++
            }
        }

        // 1) 가장 높은 점수를 찾는다.
        val maxScore = scores.maxOrNull() ?: 0
        // 최고 점수를 받은 후보(들)
        val topCandidates = (0..2).filter { scores[it] == maxScore }

        // 2) 만약 최고 점수를 받은 후보가 한 명이라면, 그 후보가 곧 회장이다.
        if (topCandidates.size == 1) {
            val winner = topCandidates[0] + 1 // 후보 번호는 1부터 시작
            return "$winner $maxScore"
        }

        // 3) 여러 후보가 최고 점수라면, 3점을 더 많이 받은 후보를 찾는다.
        val max3 = topCandidates.maxOf { cnt3[it] }
        val top3Candidates = topCandidates.filter { cnt3[it] == max3 }

        if (top3Candidates.size == 1) {
            val winner = top3Candidates[0] + 1
            return "$winner $maxScore"
        }

        // 4) 3점마저 동률인 후보들끼리, 2점을 더 많이 받은 후보를 찾는다.
        val max2 = top3Candidates.maxOf { cnt2[it] }
        val top2Candidates = top3Candidates.filter { cnt2[it] == max2 }

        if (top2Candidates.size == 1) {
            val winner = top2Candidates[0] + 1
            return "$winner $maxScore"
        }

        // 5) 3점, 2점 모두 동률이면 1점도 같을 수밖에 없으므로 회장을 결정할 수 없다.
        return "0 $maxScore"
    }
}
