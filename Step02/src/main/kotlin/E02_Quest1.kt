fun main() {
    /*
    사용자로부터 반지름 길이 값을 입력 받은 다음
    입력받은 반지름 값을 가지고 해당 원넓이를 출력

    원넓이 = 반지름 * 반지름 * 3.1415

    */

    print("반지름 길이를 입력하세요 : ")
    var r = readln().toDouble()

    var result = r * r * Math.PI
    println("원의 넓이는 : " + result)

}