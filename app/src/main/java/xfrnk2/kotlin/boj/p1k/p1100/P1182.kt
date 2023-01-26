package xfrnk2.kotlin.boj.p1k.p1100


fun main(args: Array<String>) {

    val (N, S) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }

    val size = 1 shl N
    var ans = 0


    for (s in 1 until size) {
        var sum = 0;
        for (i in 0 until N) {
            if ((s and (1 shl i)) != 0) {
                sum += list[i]
            }
        }
        if (sum == S) {
            ans++
        }

    }
    print(ans)

}