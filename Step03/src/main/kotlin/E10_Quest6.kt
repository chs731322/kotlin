fun main() {

    var score = (Math.random() * 101).toInt()
    println("점수 >> $score")

    when (score/5) {
        20, 19 -> println("A+")
        18 -> println("A")
        17 -> println("B+")
        16 -> println("B")
        15 -> println("C+")
        14 -> println("C")
        13 -> println("D+")
        12 -> println("D")
        else -> println("F")
    }

/*
    when (score/10) {
        10 -> println("A+")
        9 -> {
            if(score%10 > 4)
                println("A+")
            else
                println("A")
        }
        8 -> {
            if(score%10 > 4)
                println("B+")
            else
                println("B")
        }
        7 -> {
            if(score%10 > 4)
                println("C+")
            else
                println("C")
        }
        6 -> {
            if(score%10 > 4)
                println("D+")
            else
                println("D")
        }
        else -> println("F")
    }*/
}