package boj.problems

import java.io.BufferedReader

class No5340 {
    fun solve(input: BufferedReader): String {
        val coordinates = (1..LINE_COUNT)
            .map { input.readLine().orEmpty().trimEnd().length }

        val latitudeParts = coordinates.take(3)
        val longitudeParts = coordinates.drop(3)

        return formatOutput("Latitude", latitudeParts) +
            "\n" +
            formatOutput("Longitude", longitudeParts)
    }

    private fun formatOutput(
        label: String,
        parts: List<Int>
    ): String {
        val joinedNumbers = parts.joinToString(separator = ":")
        return "$label $joinedNumbers"
    }

    companion object {
        private const val LINE_COUNT = 6
    }
}
