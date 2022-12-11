fun main(){
    println("Bem vindo ao Bytebank")
    val titular: String = "Leo"
    val numeroConta: Int = 1000
    var saldo = 0.0 //Double
    saldo = 100 + 2.0 //A soma de um Int com Double resulta em Double, sem mudança no tipo da var.
    saldo += 200

    println("titular $titular")
    println("número da conta: $numeroConta")
    println("saldo da conta: $saldo")


}
fun testaCondicoes(saldo: Double){
    if(saldo < 0) {
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