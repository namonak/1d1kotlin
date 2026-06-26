package boj.problems

import java.io.BufferedReader

class No2503 {
    private data class Question(
        val digits: List<Int>,
        val strike: Int,
        val ball: Int
    )

    private data class Score(
        val strike: Int,
        val ball: Int
    )

    fun solve(input: BufferedReader): String {
        val questions = readQuestions(input)
        return countPossibleNumbers(questions).toString()
    }

    private fun readQuestions(input: BufferedReader): List<Question> {
        return List(input.readLine().toInt()) {
            val (number, strike, ball) = input.readLine().split(" ").map { it.toInt() }
            Question(number.toDigits(), strike, ball)
        }
    }

    private fun countPossibleNumbers(questions: List<Question>): Int {
        return (MIN_NUMBER..MAX_NUMBER).count { number ->
            val candidate = number.toDigits()
            isValidCandidate(candidate) &&
                questions.all { question -> matchesQuestion(candidate, question) }
        }
    }

    private fun isValidCandidate(candidate: List<Int>): Boolean {
        return candidate.none { it == 0 } && candidate.toSet().size == candidate.size
    }

    private fun matchesQuestion(
        candidate: List<Int>,
        question: Question
    ): Boolean {
        val score = calculateScore(candidate, question.digits)
        return score.strike == question.strike && score.ball == question.ball
    }

    private fun calculateScore(
        candidate: List<Int>,
        target: List<Int>
    ): Score {
        val strike = candidate.indices.count { index -> candidate[index] == target[index] }
        val ball = candidate.indices.count { index ->
            candidate[index] != target[index] && candidate[index] in target
        }
        return Score(strike, ball)
    }

    private fun Int.toDigits(): List<Int> {
        return toString().map { it - '0' }
    }

    private companion object {
        const val MIN_NUMBER = 123
        const val MAX_NUMBER = 987
    }
}
