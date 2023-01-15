package ds.graph

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestNode {
    @Test
    fun test_insert() {
        val node = Node(3, null, null)
        node.insert(2)
        node.insert(5)

        val left = node.mLeft
        val right = node.mRight

        assertThat(left).isNotNull
        assertThat(right).isNotNull
        assertThat(2).isEqualTo(left?.mKey)
        assertThat(5).isEqualTo(right?.mKey)

        node.insert(4)

        assertThat(left).isNotNull
        assertThat(4).isEqualTo(right?.mLeft?.mKey)
    }

    @Test
    fun test_search() {
        val node = Node(3, null, null)
        node.insert(2)
        node.insert(5)
        node.insert(4)

        var result = node.search(3)

        assertThat(result).isNotNull
        assertThat(2).isEqualTo(result?.mLeft?.mKey)
        assertThat(5).isEqualTo(result?.mRight?.mKey)

        result = node.search(4)

        assertThat(result).isNotNull
        assertThat(4).isEqualTo(result?.mKey)

        result = node.search(1)

        assertThat(result).isNull()
    }
}