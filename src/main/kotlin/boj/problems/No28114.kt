package boj.problems

import java.io.BufferedReader

private const val MAX_PARTICIPANTS = 3

class No28114 {
    data class Participant(val problems: Int, val year: Int, val surname: String)

    fun solve(input: BufferedReader): String {
        val members = Array(MAX_PARTICIPANTS) {
            val (problems, year, surname) = input.readLine().split(' ')
            Participant(problems.toInt(), year.toInt(), surname)
        }

        val first = buildYearTeamName(members)
        val second = buildSolvedTeamName(members)
        return "$first\n$second"
    }

    fun buildYearTeamName(members: Array<Participant>): String =
        members.map { it.year % 100 }
            .sorted()
            .joinToString("") { it.toString().padStart(2, '0') } // 안전하게 2자리로

    fun buildSolvedTeamName(members: Array<Participant>): String =
        members.sortedByDescending { it.problems }
            .joinToString("") { it.surname.first().toString() }
}
