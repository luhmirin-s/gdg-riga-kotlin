package lv.gdg.kotlin.kata

fun fizzBuzz(num: Int): String {
    var result = "".appendFizz(num)

    result += if(isBuzz(num)) "Buzz" else ""

    return if(result.isEmpty()){
        "$num"
    } else {
        result
    }
}


fun isFizz(i: Int) = i % 3 == 0 || "$i".contains('3')

fun isBuzz(i: Int) = i % 5 == 0 || "$i".contains('5')

private fun String.appendFizz(num: Int): String{
    return this + if (isFizz(num)) "Fizz" else ""
}