package ds.list.linkedList

import algorithm.permutation.TestCase
import org.junit.Test
import kotlin.test.assertEquals

data class TestCase(val given: IntArray, val want: IntArray)

class TestLinkedList {
    val testCase = arrayOf(
        TestCase(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
        ),
        TestCase(
            intArrayOf(1, 3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
            intArrayOf(1, 3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
        ),
    )

    @Test
    fun testLinkedList() {
        val linkedList = LinkedList()

        testCase.forEach {
            it.given.forEach {
                linkedList.add(it)
            }

            var head = linkedList.mHead

            for (i in it.want.indices) {
                assertEquals(it.want[i], head?.value)
                head = head?.next
            }
            linkedList.clear()
        }
    }
}