package ds.list.singlyLinkedList

import org.junit.Test
import kotlin.test.assertEquals

data class TestCase(val given: IntArray, val want: IntArray)

class TestSinglyLinkedList {
    val mTestAdd = arrayOf(
        TestCase(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
        ),
        TestCase(
            intArrayOf(1, 3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
            intArrayOf(1, 3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97),
        ),
    )

    val mTestAddAtHead = arrayOf(
        TestCase(
            intArrayOf(1),
            intArrayOf(1)
        ),
        TestCase(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 1)
        )
    )

    @Test
    fun testAdd() {
        val singlyLinkedList = SinglyLinkedList()

        mTestAdd.forEach {
            it.given.forEach {
                singlyLinkedList.add(it)
            }

            var head = singlyLinkedList.mHead

            for (i in it.want.indices) {
                assertEquals(it.want[i], head?.value)
                head = head?.next
            }
            singlyLinkedList.clear()
        }
    }

    @Test
    fun testAddAtHead() {
        val singlyLinkedList = SinglyLinkedList()

        mTestAddAtHead.forEach {
            it.given.forEach {
                singlyLinkedList.addAtHead(it)
            }

            var head = singlyLinkedList.mHead

            for (i in it.want.indices) {
                assertEquals(it.want[i], head?.value)
                head = head?.next
            }
            singlyLinkedList.clear()
        }
    }
}