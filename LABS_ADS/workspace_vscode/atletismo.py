class Pessoa(object):
    nome = None
    idade = None

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
    
    def envelhecer(self):
        self.idade += 1

class Atleta(Pessoa):
    peso = None
    aposentado = None

    def __init__(self, nome, idade, peso):
        super().__init__(nome, idade)
        self.peso = peso
    
    def aposentar(self):
        self.aposentado = True

class Corredor(Atleta):
    def correr(self):
        print('O Atleta está correndo!')

class Nadador(Atleta):
    def nadar(self):
        print('O Atleta está nadando!')

class Ciclista(Atleta):
    def pedalar(self):
        print('O Atleta está pedalando!')

corredor_1 = Corredor('Vanderlei', 27, 75)
corredor_1.correr

nadador_1 = Nadador('Gustavo', 35, 80)
print('Está aposentado? ')

if nadador_1.aposentado:
    print('Sim')
else: 
    print ('Não')    

nadador_1.nadar
nadador_1.envelhecer
nadador_1.aposentar

print('Agora já está aposentado? ')
print('Sim' if nadador_1.aposentado else 'Não')

ciclista_1 = Ciclista('')