package boj.problems

class No2902() {
    fun solve(input: String): String {
        return input.split("-").joinToString("") { it.first().toString() }
    }
}
