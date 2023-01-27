package xfrnk2.kotlin.boj.p10k.p10900

import kotlin.math.min

var ans = Int.MAX_VALUE
lateinit var arr: Array<IntArray>

fun main(args: Array<String>) {

    val n = readln().toInt()
    arr = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        val list = readln().split(" ").map { it.toInt() }
        for (j in 0 until n) {
            arr[i][j] = list[j]
        }
    }

    for (i in 0 until n) {
        travel(n, i, i, 1 shl i, 0, 0)
    }

    println(ans)


}

fun travel(n: Int, start: Int, next: Int, visit: Int, cost: Int, cnt: Int) {
    if (cnt == n - 1) {
        val lastCost = cost + arr[next][start]
        if (lastCost != 0 && arr[next][start] != 0) {
            ans = min(ans, lastCost)
        }
        return
    }

    for (i in 0 until n) {
        if (((visit and (1 shl i)) != 0) || arr[next][i] == 0) {
            continue
        }
        travel(n, start, i, visit or (1 shl i), cost + arr[next][i], cnt + 1)

    }
}