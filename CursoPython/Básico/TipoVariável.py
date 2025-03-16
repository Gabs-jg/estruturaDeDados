'''Declaração de variáveis:
codigo = 10 #Tipo inteiro.
salario = 1500.00 #Tipo real.
nome = 'Jose' #Tipo String. '''

#Declaração de variáveis com entrada de dados:
codigo = int(input("Digite o código do funcionário: ")) #Tipo inteiro.
salario = float(input("Informe o salário: ")) #Tipo real.
nome = input("Digite o nome do funcionário: ") #Tipo String.

ativo = True #Tipo booleano.
tipo = type(salario)

#Imprimindo no console:
'''print(salario)
print(tipo)
print("Código: ",codigo,"; Nome: ",nome,"; O salário atual é de: ",salario,";") - Concatenação das informações usando vírgula.
print("Código: "+str(codigo)+"; Nome: "+str(nome)+"; O salário atual é de: "+str(salario)+";") - Concatenação das informações usando sinal de soma.'''

#Imprimindo utilizando máscara de formatação
print("Código: %d " %codigo) #%d: Valor inteiro.
print("Nome: %s " %nome) #%s: Cadeia de caractere (String) .
print("Salário: %.2f " %salario) #%f: Valor decimal. - O .2 representa a quantidade de casas decimais que vão ser representadas.
print("Ativo: %r " %ativo) #r: Valor booleano.
