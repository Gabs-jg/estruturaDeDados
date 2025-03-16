#Importando classes:
from Cliente import Cliente;
from Conta import Conta;
class Main:
    pass;

#Instanciando um objeto:
c1 = Cliente("João", "114444-2222");
conta = Conta(c1.get_nome(), 6565,0)

#Passando valores os métodos.
conta.deposita(100);
conta.saque(50);
conta.extrato();


print(c1);
#(conta.titular, "Numero:", conta.numero, "\nSeu saldo: ", conta.saldo);
