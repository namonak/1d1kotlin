package boj.problems

import java.io.BufferedReader

class No10825 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val students = mutableListOf<Student>()
        repeat(n) {
            val (name, korean, english, math) = input.readLine().split(" ")
            students.add(Student(name, korean.toInt(), english.toInt(), math.toInt()))
        }
        students.sortWith(
            compareByDescending<Student> { it.korean }
                .thenBy { it.english }
                .thenByDescending { it.math }
                .thenBy { it.name }
        )
        return students.joinToString("\n") { it.name }
    }

    data class Student(val name: String, val korean: Int, val english: Int, val math: Int)
}
