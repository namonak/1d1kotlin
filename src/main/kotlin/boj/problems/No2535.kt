package boj.problems

import java.io.BufferedReader

class No2535 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val students = mutableListOf<Student>()
        repeat(n) {
            val (nation, number, score) = input.readLine().split(" ").map { it.toInt() }
            students.add(Student(nation, number, score))
        }

        val sortedStudents = students.sortedByDescending { it.score }
        val result = mutableListOf<Student>()
        val nationCount = mutableMapOf<Int, Int>()
        for (student in sortedStudents) {
            val currentCount = nationCount.getOrDefault(student.nation, 0)
            if (currentCount < 2) {
                result.add(student)
                nationCount[student.nation] = currentCount + 1
            }
            if (result.size == 3) break
        }

        return result.joinToString("\n") { "${it.nation} ${it.number}" }.trimEnd()
    }

    data class Student(
        val nation: Int,
        val number: Int,
        val score: Int
    )
}
