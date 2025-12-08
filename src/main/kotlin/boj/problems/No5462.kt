package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No5462 {
    data class Participant(
        val id: Int,
        val score: Int,
        val solvedCount: Int
    )

    fun solve(input: BufferedReader): String {
        // 1. 입력 데이터 파싱 (N: 참가자 수, T: 문제 수, P: 필립의 ID)
        var tokenizer = StringTokenizer(input.readLine())
        val numberOfParticipants = tokenizer.nextToken().toInt()
        val numberOfTasks = tokenizer.nextToken().toInt()
        val philipId = tokenizer.nextToken().toInt()

        // 2. 문제 풀이 여부 저장 및 각 문제의 배점 계산
        // problemScores[j] = j번째 문제를 풀지 못한 사람의 수 (문제의 점수)
        val solvedMatrix = Array(numberOfParticipants) { IntArray(numberOfTasks) }
        val problemScores = IntArray(numberOfTasks)

        for (i in 0 until numberOfParticipants) {
            tokenizer = StringTokenizer(input.readLine())
            for (j in 0 until numberOfTasks) {
                val isSolved = tokenizer.nextToken().toInt() // 1: 풀음, 0: 못 풀음
                solvedMatrix[i][j] = isSolved

                if (isSolved == 0) {
                    problemScores[j]++
                }
            }
        }

        // 3. 각 참가자의 최종 점수 및 푼 문제 수 계산
        val participants = ArrayList<Participant>(numberOfParticipants)

        for (i in 0 until numberOfParticipants) {
            var totalScore = 0
            var solvedCount = 0

            for (j in 0 until numberOfTasks) {
                if (solvedMatrix[i][j] == 1) {
                    totalScore += problemScores[j]
                    solvedCount++
                }
            }
            // ID는 1부터 시작하므로 i + 1
            participants.add(Participant(id = i + 1, score = totalScore, solvedCount = solvedCount))
        }

        // 4. 필립의 정보 추출 및 등수 계산
        // 필립의 ID는 P (index로는 P-1)
        val philip = participants[philipId - 1]

        // 필립보다 성적이 좋은 사람의 수를 센다 (정렬 불필요, O(N))
        val rank = participants.count { it.isBetterThan(philip) } + 1

        return "${philip.score} $rank"
    }

    /**
     * 현재 참가자가 비교 대상(other)보다 등수가 높은지 판단하는 함수
     * 조건:
     * 1. 점수가 더 높은 경우
     * 2. 점수가 같으면, 더 많은 문제를 푼 경우
     * 3. 점수와 푼 문제 수가 같으면, ID가 더 작은(빠른) 경우
     */
    private fun Participant.isBetterThan(other: Participant): Boolean {
        if (this.score > other.score) return true
        if (this.score < other.score) return false

        if (this.solvedCount > other.solvedCount) return true
        if (this.solvedCount < other.solvedCount) return false

        return this.id < other.id
    }
}
