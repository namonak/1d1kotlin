package boj.problems

import java.io.BufferedReader

class No5052 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val n = input.readLine().toInt()
            val phoneNumbers = List(n) { input.readLine() }
            val trie = Trie()

            var isConsistent = true
            for (number in phoneNumbers) {
                if (!trie.insert(number)) {
                    isConsistent = false
                    break
                }
            }
            result.appendLine(if (isConsistent) "YES" else "NO")
        }

        return result.toString().trimEnd()
    }

    class TrieNode {
        val children = mutableMapOf<Char, TrieNode>()
        var isEndOfWord = false
    }

    class Trie {
        private val root = TrieNode()

        fun insert(number: String): Boolean {
            var current = root
            for (digit in number) {
                if (current.isEndOfWord) return false
                current = current.children.getOrPut(digit) { TrieNode() }
            }
            if (current.children.isNotEmpty()) return false
            current.isEndOfWord = true
            return true
        }
    }
}
