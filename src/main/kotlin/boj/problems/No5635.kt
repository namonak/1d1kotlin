package boj.problems

import java.io.BufferedReader

data class Student(val name: String, val day: Int, val month: Int, val year: Int)

class No5635 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val students = ArrayList(
            (0 until n).map {
                val (name, day, month, year) = input.readLine().split(" ")
                Student(name, day.toInt(), month.toInt(), year.toInt())
            }
        )

        students.sortWith(
            compareBy(
                { it.year },
                { it.month },
                { it.day }
            )
        )

        return "${students.last().name}\n${students.first().name}"
    }
}
