fun main() {
    /*

    1부터 100까지의 숫자 중 5와 9의 배수만 출력하는 프로그램 작성
    단, 5와 9의 공배수는 한번만 출력
    5 9 10 15 18 20 25 27 ... 99 100

     */

    for(i in 1 .. 100) {
        if (i % 5 == 0 || i % 9 == 0)
            print("$i ")
    }

}