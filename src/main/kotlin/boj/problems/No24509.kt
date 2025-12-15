package boj.problems

import java.io.BufferedReader

class No24509 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val students = ArrayList<Student>(n)

        repeat(n) {
            val (id, kor, eng, math, sci) = input.readLine().split(" ").map { it.toInt() }
            students.add(Student(id, kor, eng, math, sci))
        }

        val awarded = BooleanArray(n + 1)
        val result = ArrayList<Int>(SUBJECT_COUNT)

        val comparators = listOf(
            compareByDescending<Student> { it.korean }.thenBy { it.id },
            compareByDescending<Student> { it.english }.thenBy { it.id },
            compareByDescending<Student> { it.math }.thenBy { it.id },
            compareByDescending<Student> { it.science }.thenBy { it.id }
        )

        for (comparator in comparators) {
            val sortedStudents = students.sortedWith(comparator)
            selectWinner(sortedStudents, awarded, result)
        }

        return result.joinToString(" ")
    }

    private fun selectWinner(
        sortedStudents: List<Student>,
        awarded: BooleanArray,
        result: MutableList<Int>
    ) {
        for (student in sortedStudents) {
            if (!awarded[student.id]) {
                awarded[student.id] = true
                result.add(student.id)
                return
            }
        }
    }

    private data class Student(
        val id: Int,
        val korean: Int,
        val english: Int,
        val math: Int,
        val science: Int
    )

    companion object {
        private const val SUBJECT_COUNT = 4
    }
}
