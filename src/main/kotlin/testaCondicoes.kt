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
