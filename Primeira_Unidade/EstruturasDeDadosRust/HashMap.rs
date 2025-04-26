use std::collections::HashMap;

fn main() {
    let mut capitais = HashMap::new();

    // Inserindo chaves e valores
    capitais.insert("Brasil", "Brasília");
    capitais.insert("França", "Paris");
    capitais.insert("Japão", "Tóquio");

    // Acessando um valor com base na chave
    if let Some(cidade) = capitais.get("França") {
        println!("A capital da França é: {}", cidade);
    }

    // Iterando sobre o HashMap
    for (pais, capital) in &capitais {
        println!("{} → {}", pais, capital);
    }

    // Verificando existência de uma chave
    if capitais.contains_key("Brasil") {
        println!("Temos a capital do Brasil!");
    }

    // Removendo um item
    capitais.remove("Japão");
}
