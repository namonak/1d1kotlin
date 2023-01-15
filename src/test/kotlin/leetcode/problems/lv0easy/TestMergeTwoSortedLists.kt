package leetcode.problems.lv0easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

data class MergeTwoSortedListsTestCase(val given0: ListNode?, val given1: ListNode?, val want: ListNode?)

fun buildListNode(arr: ArrayList<Int>): ListNode? {
    val head: ListNode? = ListNode(0)
    var cur = head
    for (n in arr) {
        cur?.next = ListNode(n)
        cur = cur?.next
    }
    return head?.next
}

fun nodeToIntArray(node: ListNode?): MutableList<Int> {
    val res = mutableListOf<Int>()
    var cur = node
    while(cur != null) {
        res.add(cur.`val`)
        cur = cur.next
    }
    return res
}

class TestMergeTwoSortedLists {
    private val mTestData = arrayOf(
        MergeTwoSortedListsTestCase(
            given0 = buildListNode(arrayListOf(1, 2, 4)),
            given1 = buildListNode(arrayListOf(1, 3, 4)),
            want = buildListNode(arrayListOf(1, 1, 2, 3, 4, 4))
        ),
        MergeTwoSortedListsTestCase(
            given0 = null,
            given1 = buildListNode(arrayListOf(0)),
            want = buildListNode(arrayListOf(0))
        ),
        MergeTwoSortedListsTestCase(
            given0 = null,
            given1 = null,
            want = null,
        ),
        MergeTwoSortedListsTestCase(
            given0 = buildListNode(arrayListOf(1, 8, 9, 10)),
            given1 = buildListNode(arrayListOf(3, 4)),
            want = buildListNode(arrayListOf(1, 3, 4, 8, 9, 10))
        ),
        MergeTwoSortedListsTestCase(
            given0 = buildListNode(arrayListOf(3, 4)),
            given1 = buildListNode(arrayListOf(1, 8, 9, 10)),
            want = buildListNode(arrayListOf(1, 3, 4, 8, 9, 10))
        ),
    )

    @Test
    fun testMergeTwoSortedLists() {
        val mergeTwoLists = MergeTwoSortedLists()
        for (testCase in mTestData) {
            val got = mergeTwoLists.mergeTwoLists(testCase.given0, testCase.given1)
            for (i in 0 until nodeToIntArray(got).size) {
                assertThat(nodeToIntArray(got)[i]).isEqualTo(nodeToIntArray(testCase.want)[i])
            }
        }
    }
}