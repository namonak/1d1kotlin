package boj.problems

import java.io.BufferedReader

class No7596 {
    fun solve(input: BufferedReader): String {
        return buildString {
            var scenarioNumber = 1

            while (true) {
                val songCount = input.readLine()?.trim()?.toIntOrNull() ?: 0
                if (songCount == 0) break

                val songs = readSongs(input, songCount)
                val sortedSongs = songs.sortedWith(String.CASE_INSENSITIVE_ORDER)

                appendScenarioResult(scenarioNumber++, sortedSongs)
            }
        }.trimEnd()
    }

    /**
     * 지정된 개수만큼의 곡 제목을 읽어 리스트로 반환합니다.
     */
    private fun readSongs(
        input: BufferedReader,
        count: Int
    ): List<String> {
        return List(count) {
            input.readLine() ?: ""
        }
    }

    /**
     * 시나리오 번호와 정렬된 곡 목록을 StringBuilder 포맷에 맞춰 추가합니다.
     */
    private fun StringBuilder.appendScenarioResult(
        number: Int,
        songs: List<String>
    ) {
        append(number).append("\n")
        songs.forEach { song ->
            append(song).append("\n")
        }
    }
}
