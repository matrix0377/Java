Projeto em Java Programação Orientada a Objetos

    Conceitos aplicados:
    
       - Diagrama de Classe
       - Algorítmo
       - Pilar Encapsulamento
    

Diagrama de Classe

    |-----------------------------|
    |         Caneta              |
    |-----------------------------|
    | - modelo                    |
    | - ponta                     |
    | - cor                       |
    | - tampada                   |
    |-----------------------------|
    | + tampar()                 |
    | + destampar()              |
    |                             |
    | + getModelo()               |
    | + setModelo()               |
    | + getPonta()                |
    | + setPonta()                |
    |-----------------------------|

Algorítmo

    Classe Caneta
    modelo: Caractere
    cor: Caractere
    ponta: Real
    carga: Inteiro
    tampada: Lógico
    
        Metodo rabiscar()
            Se (tampada) então
                Escreva("ERRO")
            senao
                Escreva("RABISCO")
            FimSe
        FimMetodo
        Metodo tampar()
            tampada = verdadeiro
        FimMetodo
    FimClasse
