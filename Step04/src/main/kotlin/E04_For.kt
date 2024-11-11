fun main() {
    // 1~10까지 출력
    for(i in 1..10) {
        print("$i ")
    }
    println()

    //1~10까지 2씩 증가해서 출력
    for(i in 1..10 step 2) {
        print("$i ")
    }
    println()

    //1~9까지 2씩 증가해서 출력
    for(i in 1 until 10 step 2)
        print("$i ")
    println()

    //10~1까지 출력
    for(i in 10 downTo 1)
        print("$i ")
    println()

    //10~1까지 2씩 감소해서 출력
    for(i in 10 downTo 1 step 2)
        print("$i ")
    println()

    //배열 순회
    var arr = arrayOf(5, 2, 6, 7, 100, 23)

    //데이터를 처음부터 마지막까지 한 개씩 가져옴
    for(i in arr) {
        print("$i ")
    }
    println()

/*    var i = 0
    while (i < arr.size) {
        print(arr[i])
        print(" ")
        i++
    }
    println()
    */

    //번호표를 처음부터 마지막까지 한 개씩 가져옴
    for(i in arr.indices) {
        print("${arr[i]} ")
    }
    println()

    //번호표와 데이터를 같이 가져옴
    for((index, value) in arr.withIndex()) {
        println("arr[$index] = $value")
    }

}