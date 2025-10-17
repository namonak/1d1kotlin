package boj.problems

import java.io.BufferedReader
import java.util.PriorityQueue

class No20920 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val wordFrequency = mutableMapOf<String, Int>()

        // 1. 각 단어의 빈도수를 계산합니다.
        for (i in 0 until n) {
            val word = input.readLine()
            wordFrequency[word] = wordFrequency.getOrDefault(word, 0) + 1
        }

        // 우선순위 큐를 사용하여 정렬합니다.
        val priorityQueue = PriorityQueue<Word> { w1, w2 ->
            when {
                w1.frequency != w2.frequency -> w2.frequency - w1.frequency
                w1.text.length != w2.text.length -> w2.text.length - w1.text.length
                else -> w1.text.compareTo(w2.text)
            }
        }

        for ((word, freq) in wordFrequency) {
            if (word.length >= m) {
                priorityQueue.add(Word(word, freq))
            }
        }

        val result = StringBuilder()
        while (priorityQueue.isNotEmpty()) {
            result.append(priorityQueue.poll().text).append("\n")
        }

        return result.toString().trim()
    }

    data class Word(val text: String, val frequency: Int)
}
