fun main() {
    println("Bem vindo ao Bytebank")

//    for (i in 1..6){
//        val titular: String = "Leo + $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = 0.0 + i//Double
//
//        println("titular $titular")
//        println("número da conta: $numeroConta")
//        println("saldo da conta: $saldo")
//    }

//    for (i in 5 downTo 0){
//        val titular: String = "Leo + $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = 0.0 + i//Double
//
//        println("titular $titular")
//        println("número da conta: $numeroConta")
//        println("saldo da conta: $saldo")
//    }
//        for (i in 1..6 step 2){
//        val titular: String = "Leo + $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = 0.0 + i//Double
//
//        println("titular $titular")
//        println("número da conta: $numeroConta")
//        println("saldo da conta: $saldo")
//    }

//    val titular: String = "Leo"
//    val numeroConta: Int = 1000
//    var saldo = 0.0 //Double
    var i = 0
    while (i < 5){ //Enquanto i for menor que 5 execute esse comando:
        val titular: String = "Leo + $i"
        val numeroConta: Int = 1000 + i
        var saldo = 0.0 + i//Double

        println("titular $titular")
        println("número da conta: $numeroConta")
        println("saldo da conta: $saldo")
        i++
    }




}

fun testaCondicoes(saldo: Double) {
    if (saldo < 0) {
        println("Você está devendo.")
    } else if (saldo == 0.0) {
        println("Saldo zerado!")
    } else {
        println("Parabéns! Seu saldo está positivo!")
    }

    when {
        saldo < 0 -> {
            println("Você está devendo, veja nossas opções de emprestimo para sair dessa situação")
        }

        saldo == 0.0 -> {
            println("Saldo zerado! não pode comprar mais nada por hoje.")
        }

        else -> {
            println("Seu saldo é positivo, você precisa gastar. Conheça nosso cartão de crédito.")
        }
    }
}