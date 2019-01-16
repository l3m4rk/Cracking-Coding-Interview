package leetcode.easy

/**
 * @author l3m4rk
 * Created on 2019-01-16.
 */

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * TODO Could you implement it without using extra memory?
 */
fun singleNumber(nums: IntArray): Int {
    val hash = HashMap<Int, Int>()

    nums.forEach {
        if (hash.contains(it)) {
            hash[it] = hash[it]!! + 1
        } else {
            hash[it] = 1
        }
    }

    hash.forEach  {
        if (it.value == 1) return it.key
    }
    return -1
}