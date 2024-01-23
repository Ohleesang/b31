/**
 * idx : 짝수 or 홀수
 * 짝수 : query[idx]를 제외한 뒷부분을 잘라서 버림
 * 홀수 : query[idx]를 제외한 앞부분을 잘라서 버림
 */


class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr.toList()
        //query[i] 가아니라 i 라는디?
        for (idx in query.indices) {
            answer = if (idx % 2 == 0) {
                answer.subList(0, query[idx] + 1)
            } else {
                answer.subList(query[idx], answer.lastIndex + 1)
            }
        }
        return answer.toTypedArray().toIntArray()
    }
}

fun main() {
    Solution().solution(intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(4, 1, 2))//1,2,3
    Solution().solution(intArrayOf(1, 3, 5, 7, 9, 11), intArrayOf(5, 0, 4, 1, 2))//3,5,7
}