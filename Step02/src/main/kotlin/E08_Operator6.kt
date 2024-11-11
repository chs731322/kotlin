fun main() {
    var a = 10 // 1010
    var b = 3 // 0011

    println(a and b) // 양쪽이 모두 1일 때만 1 >> 0010 >> 2출력
    println(a or b) // 한 쪽이 1이면 1 >> 1011 >> 11출력
    println(a xor b) // 서로 다르면 1 서로 같으면 0 >> 1001 >> 9출력
    println(a.inv()) // 비트를 반전
    println(a shl 2) // shift 연산자 / 왼쪽으로 비트 2칸 밀기
    println(a shr 2) // 오른쪽으로 비트 2칸 밀기
    println(a ushr 2) // 부호 비트 무시하고 같이 옮긴다

}