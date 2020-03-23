package br.com.dbccompany.support

class Usuarios {

    def static testUsers = [
            [
                    "env": "uat",
                    "cpf" : "24307102002"
            ],
            [
                    "env": "dev",
                    "cpf" : "14146286840"
            ]
    ]

    def static retornaUsuario(){
        return testUsers.find { it.env == System.getenv("ENV") }.cpf
    }
}
