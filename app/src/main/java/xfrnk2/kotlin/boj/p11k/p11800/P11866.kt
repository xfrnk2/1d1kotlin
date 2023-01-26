package xfrnk2.kotlin.boj.p11k.p11800


fun main(args: Array<String>) {

    val (N, K) = readln().split(" ").map { it.toInt() }


    val arrayDeque = ArrayDeque<Int>()
    for (i in 1..N) {
        arrayDeque.add(i)
    }
    val answers = arrayListOf<Int>()


    while (!arrayDeque.isEmpty()) {
        for (i in 1 until K) {
            arrayDeque.add(arrayDeque.removeFirst())
        }
        answers.add(arrayDeque.removeFirst())
    }

    print("<" + answers.joinToString(", ") + ">")


}