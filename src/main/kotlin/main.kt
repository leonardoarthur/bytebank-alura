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
    contaCarla.deposita(65.0)
    println(contaCarla.saldo)

    println("Saque de 10 reais da conta:")
    contaCarla.sacar(10.0)
    println(contaCarla.saldo)

    println("Saque de 1000 reias (Não tem na conta)")
    contaCarla.sacar(1000.0)
    println(contaCarla.saldo)


}


//Primeira letra da CLASSE é mauscula!
//Classe é um molde, voce coloca ele e preenche com algo, um molde que pode ser usado varias vzs.
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 100.0

    fun deposita(valor: Double){
        this.saldo += valor  // O THIS sibstitui o CONTA, pois o THIS fala "NESSE OBJETO QUE ESTOU AGORA". (Olhar Commit e comparar)
}

    //A FUN deposita veio para dentro da classe pois: As classes são as responsáveis por modificar seus atributos.
    // qualquer comportamento que ajuste o estado da classe (modifique os atributos), deve ser implementado pela própria classe.
    fun sacar(valor: Double){
        if(saldo > valor){
            this.saldo -= valor  // Mais uma vez o THIS fazedno referencia ao OBJETO em que a FUN está no momento.
        }else{
            println("Infelizmente o valor digitado não está disponivel no sue saldo.")
        }
    }
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