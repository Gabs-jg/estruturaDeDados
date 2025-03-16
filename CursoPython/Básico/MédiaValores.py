#Declaração de variáveis:
quantidade_de_valores = 0;
soma = 0;
media = 0;
valor = float(input("Digite um valor: "));

#Vai fazer a soma de todos os valores positivos informados pelo usuário, quando o usuário informar um valor negativo o laço se encerra.
while(valor > 0.0):
    soma = soma + valor;
    quantidade_de_valores = quantidade_de_valores + 1;
    #Entrada de valores:
    valor = float(input("Digite um valor: "))

#Calcular média:
media = soma / quantidade_de_valores;
#Imprimindo no console:
print("\nTotal da soma: ", soma);
print("Quantidade de valores digitados: ", quantidade_de_valores);
print("Média dos valores: ", media);