package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No20336 {
    fun solve(input: BufferedReader): String {
        val menus = readMenus(input)
        val recommended = chooseMenu(menus)

        return buildString {
            appendLine(recommended.size)
            recommended.forEach { dish -> appendLine(dish) }
        }.trimEnd()
    }

    private fun readMenus(input: BufferedReader): List<Menu> {
        val n = input.readLine().trim().toInt()
        val menus = mutableListOf<Menu>()

        repeat(n) {
            val st = StringTokenizer(input.readLine())
            val dishCount = st.nextToken().toInt()
            val dishes = mutableListOf<String>()

            repeat(dishCount) {
                dishes.add(st.nextToken())
            }

            menus.add(Menu(dishes))
        }

        return menus
    }

    private fun chooseMenu(menus: List<Menu>): List<String> {
        return menus.first().dishes
    }

    private data class Menu(val dishes: List<String>)
}
