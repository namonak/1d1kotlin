package boj.problems

import java.io.BufferedReader

class No4732 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val line = input.readLine()
            if (line == null || line == EXIT_COMMAND) break

            val shift = input.readLine().toInt()

            val transposedNotes =
                line.split(" ").joinToString(" ") { note -> transpose(note, shift) }

            result.append(transposedNotes).append("\n")
        }

        return result.toString().trimEnd()
    }

    private fun transpose(
        note: String,
        shift: Int
    ): String {
        val currentIndex = NOTE_TO_INDEX[note]
            ?: throw IllegalArgumentException("Invalid note: $note")

        val nextIndex = (currentIndex + shift).mod(SCALE_SIZE)

        return SCALE[nextIndex]
    }

    companion object {
        private const val SCALE_SIZE = 12
        private const val EXIT_COMMAND = "***"
        private val SCALE = listOf(
            "A",
            "A#",
            "B",
            "C",
            "C#",
            "D",
            "D#",
            "E",
            "F",
            "F#",
            "G",
            "G#"
        )
        private val NOTE_TO_INDEX = mapOf(
            "A" to 0,
            "A#" to 1,
            "Bb" to 1, // 이명동음 처리
            "B" to 2,
            "Cb" to 2,
            "C" to 3,
            "B#" to 3,
            "C#" to 4,
            "Db" to 4,
            "D" to 5,
            "D#" to 6,
            "Eb" to 6,
            "E" to 7,
            "Fb" to 7,
            "F" to 8,
            "E#" to 8,
            "F#" to 9,
            "Gb" to 9,
            "G" to 10,
            "G#" to 11,
            "Ab" to 11
        )
    }
}
