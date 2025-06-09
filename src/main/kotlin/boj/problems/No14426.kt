package boj.problems

import java.io.BufferedReader

class No14426 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val words = List(n) { input.readLine() }
        val prefixes = List(m) { input.readLine() }
        val trie = Trie()

        for (word in words) {
            trie.insert(word)
        }

        val count = trie.countPrefixes(prefixes)

        return count.toString()
    }

    class TrieNode {
        val children = mutableMapOf<Char, TrieNode>()
        var isEndOfWord = false
    }

    class Trie {
        private val root = TrieNode()

        fun insert(word: String) {
            var current = root
            for (char in word) {
                current = current.children.getOrPut(char) { TrieNode() }
            }
            current.isEndOfWord = true
        }

        fun countPrefixes(prefixes: List<String>): Int {
            return prefixes.count { startsWith(it) }
        }

        private fun startsWith(prefix: String): Boolean {
            var current = root
            for (char in prefix) {
                current = current.children[char] ?: return false
            }
            return true
        }
    }
}
