
fun pairs(x : Int, pair : Boolean) {
    for(i in 1..x){
        if(pair) {
            println(i * 2)
        }else{
            println(i*2-1)
        }
    }
}

fun fibonnacci(x : Int) {
    var a = 0
    var b = 1
    var c = 0
    for(i in 1..x){
        println(a)
        c = a + b
        a = b
        b = c
    }
}

fun factioriel(x : Int = 10): Int {
    var result = 1
    for(i in 2..x){
        result *= i
    }
    return result
}

fun nbPremier(x : Int){
    var isPremier = true
    var i = 1
    var count = 0
    while(count<x){
        var j = 2
        while(j<i){
            if(i%j == 0){
                isPremier = false
                break
            }
            j++
        }
        if(isPremier){
            println(i)
            count++
        }
        isPremier = true
        i++
    }
}


pairs(5, true)
pairs(5, false)
fibonnacci(10)
println(factioriel(5))
println(factioriel())
nbPremier(15)