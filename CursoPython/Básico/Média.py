#Entrada de dados:
notaA = float(input("Informe a primeira nota: "));
notaB = float(input("Informe a segunda nota: "));

#Calcular media:
media_final = (notaA + notaB) / 2;

#Verificação:
if media_final >= 7.0:
    print("A média: %.1f - Aprovado " %media_final);
else:
    print("A média: %.1f - Repprovado " %media_final);