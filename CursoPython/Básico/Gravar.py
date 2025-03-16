#Escrita do arquivo:
#Atribuindo uma função à uma variável.
'''arquivo = open('arqText.txt', 'w'); #A função open é utilizada para a abertura dos arquivos. o w serve para fazer a escrita em um arquivo.

#Chamada da função.
#Função write: É utilizada para gravar informações em um arquivo existente.
arquivo.write('Curso Python \n');
arquivo.write('Aula Prática');
arquivo.close; #A função close encerra o arquivo após sua utilização.'''

#Leitura do arquivo:
leitura = open('arqText.txt', 'r')
print(leitura.read())
leitura.close()