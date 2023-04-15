fun main() {
    println("Bem vindo ao Bytebank")
    val contaLeo = Conta(titular = "Leo", numero = 10.0)


    val contaCarla = Conta(
        numero = 12.0,
        titular = "Carla"
    ) //Labels são esses "parametros", ao invés de deixer a IDE colocar você pode colocar na sua ordem
    var contaLiza = contaCarla
    contaLiza.titular = "Liza"
    contaLiza.deposita(854.0)

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

    println("Saque de 1000 reais (Não tem na conta)")
    contaCarla.sacar(1000.0)
    println(contaCarla.saldo)

    println("Valores em saldo das contas Leo e Carla")
    println(contaLeo.saldo)
    println(contaCarla.saldo)

    println("Transferência entre contas:")
    contaCarla.tranferencia(100.00, contaLeo)
    println(contaCarla.saldo)
    println(contaLeo.saldo)


}


//Primeira letra da CLASSE é maiuscula!
//Classe é um molde, voce coloca ele e preenche com algo, um molde que pode ser usado varias vzs.
class Conta(var titular: String, val numero: Double, opcional: Int = 0) {
    var saldo = 100.0 //Modificador de acesso, o padrão é Public
        private set // Properties, mais idiomatico ao Kotlin.


    //Como seria com um construtor "secundario", mas podemos usar um primario na propria classe.
//    constructor(titular: String, numero: Double){
//        this.titular = titular
//        this.numero = numero
//
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor  // O THIS subistitui o CONTA, pois o THIS fala "NESSE OBJETO QUE ESTOU AGORA".
        }

    }

    //A FUN deposita foi para dentro da classe pois: As classes são as responsáveis por modificar seus atributos.
    // qualquer comportamento que ajuste o estado da classe (modifique os atributos), deve ser implementado pela própria classe.
    fun sacar(valor: Double) {
        if (saldo > valor) {
            this.saldo -= valor  // Mais uma vez o THIS fazedno referencia ao OBJETO em que a FUN está no momento.
        } else {
            println("Infelizmente o valor digitado não está disponivel no sue saldo.")
        }
    }

    fun tranferencia(valor: Double, destino: Conta) {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        } else {
            println("Não é possivel realizar a transferencia! Saldo insuficiente.")
        }
    }

    // Isso é encapsulamento, deixamos a variavel protegida e criamos uma copia segura dela para usar.
//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }
//}

    fun testaLacos() {
        var i = 0
        while (i < 5) { //Enquanto i for menor que 5 execute esse comando:
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
}