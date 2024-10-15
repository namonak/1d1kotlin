package boj.problems

import java.io.BufferedReader

class No18221 {
    private lateinit var professor: Position
    private lateinit var sungkyu: Position

    data class Position(val x: Int, val y: Int)

    companion object {
        const val PROFESSOR = 5
        const val SUNGKYU = 2
        const val STUDENT = 1
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val classRoom = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        findProfessorAndSungkyuPositions(n, classRoom)

        return if (canEscape(classRoom)) "1" else "0"
    }

    private fun canEscape(classRoom: Array<IntArray>): Boolean {
        return distance(professor, sungkyu) >= 25 && calculateNumberOfStudents(classRoom, professor, sungkyu) >= 3
    }

    private fun calculateNumberOfStudents(classRoom: Array<IntArray>, professor: Position, sungkyu: Position): Int {
        var numberOfStudents = 0
        for (i in minOf(professor.x, sungkyu.x)..maxOf(professor.x, sungkyu.x)) {
            for (j in minOf(professor.y, sungkyu.y)..maxOf(professor.y, sungkyu.y)) {
                if (classRoom[i][j] == STUDENT) {
                    numberOfStudents++
                }
            }
        }
        return numberOfStudents
    }

    private fun findProfessorAndSungkyuPositions(n: Int, classRoom: Array<IntArray>) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                when (classRoom[i][j]) {
                    PROFESSOR -> professor = Position(i, j)
                    SUNGKYU -> sungkyu = Position(i, j)
                }
            }
        }
    }

    private fun distance(p1: Position, p2: Position): Int {
        val dx = p1.x - p2.x
        val dy = p1.y - p2.y
        return dx * dx + dy * dy
    }
}
