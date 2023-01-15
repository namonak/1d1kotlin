package ds.list.singlyLinkedList

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
                assertThat(it.want[i]).isEqualTo(head?.value)
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
                assertThat(it.want[i]).isEqualTo(head?.value)
                head = head?.next
            }
            singlyLinkedList.clear()
        }
    }

    @Test
    fun testVariousFunctions() {
        val singlyLinkedList = SinglyLinkedList()
        var want = intArrayOf(1, 2, 3, 4, 5)

        singlyLinkedList.add(2)
        singlyLinkedList.add(3)
        singlyLinkedList.addAtHead(1)
        singlyLinkedList.addBack(5)
        singlyLinkedList.addAfter(singlyLinkedList.findNode(3), 4)

        var current = singlyLinkedList.mHead
        var i = 0
        while (current?.next != null) {
            assertThat(want[i]).isEqualTo(current.value)
            current = current.next
            i++
        }

        // findNode는 없는 값을 찾으면 null을 반환하며, addAfter는 null node를 추가하는 경우 아무런 동작을 하지 않는다.
        singlyLinkedList.addAfter(singlyLinkedList.findNode(6), 7)
        // findNode에서 없는 값을 찾으면 null을 반환하며, deleteAfter에서 null node를 삭제하는 경우 아무런 동작을 하지 않고 return 한다
        singlyLinkedList.deleteAfter(singlyLinkedList.findNode(6))
        singlyLinkedList.deleteAfter(singlyLinkedList.findNode(5))
        singlyLinkedList.deleteAfter(singlyLinkedList.findNode(3))
        singlyLinkedList.deleteAfter(singlyLinkedList.mHead)

        want = intArrayOf(1, 3, 5)

        current = singlyLinkedList.mHead
        i = 0
        while (current?.next != null) {
            assertThat(want[i]).isEqualTo(current.value)
            current = current.next
            i++
        }
    }
}