fun main() {

/*
    Variable (=변수) : 값을 저장하는 공간

    변수 선언 방법
    var 변수명 = 값         //초기화 (initialized/init)
    var 변수명 : 자료형 = 값

    var 변수명 : 자료형
    변수명 = 값

    [자료형] (1byte = 8bit)
        - 정수형 / Byte, Short(2byte), Int(4byte), Long(8byte)
        - 실수형 / Float, Double
        - 문자형 / Character (한 글자당 2byte)
        - 논리형 / Boolean
        - 문자열 / String

        변수명 작성법 - 문법 X
            > Camel case : 첫 글자는 소문자, 뒤에는 단어들의 첫 글자는 대문자 (변수명, 함수명)
                            ex) studentName, studentMajorName
            > Pascal case : 첫 글자도 대문자, 뒤 단어들의 첫 글자도 대문자 (클래스명)
                            ex) TestVariableName, CafeBoard
            > Snake case : 전부 소문자, 단어와 단어 사이 _
                            ex) student_no, btn_register

        변수명 작성 규칙 - 문법 O
            - 숫자로 시작할 수 없음, 시작은 알파벳, _만 가능
            - 특수문자는 _만 가능
            - 대소문자 구분
            - 알파벳 대소문자, 숫자, _ 조합으로 사용
            - 변수명은 띄어쓰기 불가
            - 키워드(예약어)를 일치하게 사용할 수 없음


*/

    var a = 10 //자동으로 a의 자료형 = int
    a = 90 // 마지막에 저장된 값이 유지됨

    println(a)
    println()

    var name = "haesol(해솔)" //자동으로 name의 자료형 = String

    println(name)
    println()

    var b : Int = 25
    println(b) //변수 선언 후에 초기화 안하고 사용하면 에러 남

        // 정수형 변수 선언, 최대값 저장
    var number1 : Byte = 127 //-128~127
        //var number1 : Byte.MAX_VALUE >> 최대값 출력
    var number2 : Short = 32767 //2^15-1
    var number3 : Int = 2147483647 // 2^31-1
    var number4 : Long = 9223372036854775807 //2^63-1

    println(number1)
    println(number2)
    println(number3)
    println(number4)

}