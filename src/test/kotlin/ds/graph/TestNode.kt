package ds.graph

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TestNode {
    @Test
    fun test_insert() {
        val node = Node(3, null, null)
        node.insert(2)
        node.insert(5)

        val left = node.mLeft
        val right = node.mRight

        assertNotNull(left, "왼쪽 노드가 생성되지 않음")
        assertNotNull(right, "오른쪽 노드가 생성되지 않음")
        assertEquals(2, left.mKey, "왼쪽 노드 값이 정상적이지 않음")
        assertEquals(5, right.mKey, "오른쪽 노드 값이 정상적이지 않음")

        node.insert(4)

        assertNotNull(right.mLeft, "노드가 생성되지 않음")
        assertEquals(4, right.mLeft!!.mKey, "노드 값이 정상적이지 않음")
    }
}