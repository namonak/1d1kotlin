package boj.problems

import java.io.BufferedReader

class No14544 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        val numVotes = input.readLine().toInt()

        repeat(numVotes) { voteIndex ->
            val (numCandidates, numVotesPerCandidate) = input.readLine().split(" ").map { it.toInt() }
            val candidates = mutableListOf<String>()
            val votes = mutableMapOf<String, Int>()

            repeat(numCandidates) {
                candidates.add(input.readLine())
            }

            repeat(numVotesPerCandidate) {
                val (candidate, voteCount, _) = input.readLine().split(" ")
                votes[candidate] = votes.getOrDefault(candidate, 0) + voteCount.toInt()
            }

            val maxVotes = votes.values.maxOrNull() ?: 0
            val winners = votes.filterValues { it == maxVotes }.keys

            sb.append("VOTE ${voteIndex + 1}: ")
            if (winners.size == 1) {
                sb.append("THE WINNER IS ${winners.first()} $maxVotes")
            } else {
                sb.append("THERE IS A DILEMMA")
            }
            sb.append("\n")
        }

        return sb.toString().trim()
    }
}
