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
            if (nationCount[student.nation] == null) {
                nationCount[student.nation] = 1
                result.add(student)
            } else if (nationCount[student.nation]!! < 2) {
                nationCount[student.nation] = nationCount[student.nation]!! + 1
                result.add(student)
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
