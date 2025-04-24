fn main() {
// Criando um vetor de inteiros
    let mut numeros = vec![10, 20, 30];

// Adicionando elementos
    numeros.push(40);
    numeros.push(50);
// Acessando elementos por índice
    println!("Primeiro elemento: {}", numeros[0]);
// Iterando sobre o vetor
    for num in &numeros {
    println!("Número: {}", num);
    }
// Removendo o último elemento
    numeros.pop();
// Verificando o tamanho
    println!("Tamanho do vetor: {}", numeros.len());
    