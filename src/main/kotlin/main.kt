fun main() {
    println("Bem vindo ao Bytebank")
    val contaLeo = Conta()
    contaLeo.titular = " Leo"


    val contaCarla = Conta()
    contaCarla.titular = "Carla"
    contaCarla.saldo = 100.0
    var contaLiza = contaCarla
    contaLiza.titular = "Liza"
    contaLiza.saldo = 854.0

    println(contaCarla)
    println(contaLiza)  //Vai dar o mesmo valor HEX pois uma está ligada a outra, dando o mesmo resultado.
    println(contaLiza.saldo)
    println(contaLiza.titular)
    println(contaCarla.titular)
    println(contaCarla.saldo)

    println("Depositando na conta da Carla:")
    deposita(contaCarla, 65.0)
    println(contaCarla.saldo)
}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor

}

//Primeira letra da CLASSE é mauscula!
//Classe é um molde, voce coloca ele e preenche com algo, um molde que pode ser usado varias vzs.
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 100.0
}

fun testaLacos(){
    var i = 0
    while (i < 5){ //Enquanto i for menor que 5 execute esse comando:
        val titular: String = "Leo $i"
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