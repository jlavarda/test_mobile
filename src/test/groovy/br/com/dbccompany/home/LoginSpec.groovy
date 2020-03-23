package br.com.dbccompany.home

import br.com.dbccompany.pageSteps.HomeStep
import br.com.dbccompany.support.Drivers
import spock.lang.Specification

class LoginSpec extends Specification {

    def ib = new HomeStep(Drivers.getChromeDriver())

    def "Efetuar login com sucesso"(codigo, usuario, senha) {
        given: "que gostaria de acessar o sistema"
        when: "insiro as minhas credenciais"
        ib.inserirCredenciais(codigo, usuario, senha)

        then: "pressiono o botão Entrar"
        ib.pressionarEntrar()
        ib.finalizarSessao()

        where:
        codigo      | usuario      | senha
        "948938608" | "TESTE37ADM" | "desenv"
    }
}
