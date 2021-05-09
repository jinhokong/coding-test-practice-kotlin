package programmers.`42746`

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class Solution {

    private fun solution(numbers: IntArray): String {
        return numbers.sortedWith { n1, n2 -> "${n2}${n1}".compareTo("${n1}${n2}") }.joinToString("").toInt().toString()
    }

    @Test
    fun test1() {
        val numbers = intArrayOf(6, 10, 2)
        assertThat(solution(numbers)).isEqualTo("6210")
    }

    @Test
    fun test2() {
        val numbers = intArrayOf(3, 30, 34, 5, 9)
        assertThat(solution(numbers)).isEqualTo("9534330")
    }

    @Test

    fun test3() {
        val numbers = intArrayOf(0, 0, 0)
        assertThat(solution(numbers)).isEqualTo("0")
    }
}
