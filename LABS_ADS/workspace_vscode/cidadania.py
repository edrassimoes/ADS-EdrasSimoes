class Pessoa():
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade        
        
class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf

#Solicitação dos dados ao usuario
cidadao = Cidadao

cidadao.nome = input("Informe seu nome: ")
cidadao.sexo = input("Informe seu sexo (F/M): ")
cidadao.idade = input("Informe sua idade: ")
cidadao.cpf = input("Informe seu CPF: ")

#Apresentação dos dados do usuario
print("Nome: ", cidadao.nome)
print("Sexo: ", cidadao.sexo)
print("Idade: ", cidadao.idade)
print("CPF: ", cidadao.cpf)


    