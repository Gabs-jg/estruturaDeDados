use std::collections::HashSet;

fn main() {
    let mut numeros = HashSet::new();

    // Adicionando elementos
    numeros.insert(1);
    numeros.insert(2);
    numeros.insert(3);
    numeros.insert(2); // Ignorado, pois já existe

    // Mostrando os elementos do conjunto
    for n in &numeros {
        println!("Número: {}", n);
    }

    // Verificando se contém um valor
    if numeros.contains(&2) {
        println!("O conjunto contém o número 2.");
    }

    // Removendo um valor
    numeros.remove(&3);

    // Tamanho do conjunto
    println!("Tamanho atual: {}", numeros.len());
}
