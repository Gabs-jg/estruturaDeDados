class Cliente:
    def __init__(self, nome, telefone):
        self._nome = nome;
        self._telefone = telefone;

    #Métodos acessores:
    #Método get:
    def get_nome(self):
        return self._nome;

    #Método set:
    def set_nome(self, nome):
        self._nome = nome;
