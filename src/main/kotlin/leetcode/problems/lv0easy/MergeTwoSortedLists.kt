package leetcode.problems.lv0easy

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
    fun mergeTwoLists(
        list1: ListNode?,
        list2: ListNode?
    ): ListNode? {
        var l1 = list1
        var l2 = list2
        val head = ListNode(0)
        var cur = head

        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                cur.next = l1
                l1 = l1.next
            } else {
                cur.next = l2
                l2 = l2.next
            }
            cur = cur.next!!
        }

        if (l1 != null) {
            cur.next = l1
        } else if (l2 != null) {
            cur.next = l2
        }

        return head.next
    }
}
