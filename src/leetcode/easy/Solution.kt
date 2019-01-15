package leetcode.easy

import java.util.*
import kotlin.collections.HashMap

/**
 * @author l3m4rk
 * Created on 01/11/2018.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
fun main(args: Array<String>) {
    twoSumN(intArrayOf(2, 7, 11, 15), 9).also { println(Arrays.toString(it)) }
}

fun twoSumN2(numbers: IntArray, target: Int): IntArray {
    for (i in 0 until numbers.size) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] + numbers[j] == target) return intArrayOf(i, j)
        }
    }
    return intArrayOf()
}

fun twoSumN(numbers: IntArray, target: Int): IntArray {
    val hash = HashMap<Int, Int>()

    numbers.forEachIndexed { index, number ->
        if (hash.containsKey(target - number)) {
            return intArrayOf(hash[target - number]!!, index)
        } else {
            hash[number] = index
        }
    }

    return intArrayOf()
}
