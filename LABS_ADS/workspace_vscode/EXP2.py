class Pessoa(object):
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade ):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf


n = input('Entre com um Nome: ')
s = input('Entre com o Sexo: M ou F ')
i = input('Entre com a Idade: ')
c = input('Entre com o CPF: ')
cidadao_1 = Cidadao(n, s, i, c)

print(cidadao_1.nome, cidadao_1.sexo, cidadao_1.idade, cidadao_1.cpf)