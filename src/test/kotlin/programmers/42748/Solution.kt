package programmers.`42748`

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class Solution {
    
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { array.slice((it[0] - 1) until (it[1])).sorted()[it[2] - 1] }.toIntArray()
    }

    @Test
    fun test() {
        val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
        val commands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        assertThat(solution(array, commands)).isEqualTo(intArrayOf(5, 6, 3))
    }
}
