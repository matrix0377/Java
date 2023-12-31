Projeto Java
Neste projeto coloquei em prática os conceitos de:
- Orientação a Objetos;
- Pilares da POO;
- Relacionamento entre Classes;
- Agregação entre Objetos com Java.


Diagrama de Classe 

primeira classe

    |-----------------------------|
    |        Lutador              |
    |-----------------------------|
    | -  nome                     |
    | -  nacionalidade            |
    | -  idade                    |
    | -  altura                   |
    | -  peso                     |
    | -  categoria                |
    | -  vitorias                 |
    | -  derrotas                 |
    | -  empates                  |
    |-----------------------------|
    | + apresentar()              |
    | + status()                  |
    | + ganharLuta()              |
    | + perderLuta()              |
    | + empatarLuta()             |
    |-----------------------------|


Algorítmo

    classe Lutador
    // Atributos
    privado nome: Caractere
    privado nacionalidade: Caractere
    privado idade: Inteiro
    privado altura: Real
    privado peso: Real
    privado categoria: Caractere
    privado vitorias: Inteiro
    privado derrotas: Inteiro
    privado empates: Inteiro
    
    // Métodos
    publico metodo apresentar()
        Escreva("Lutador: ", getNome())
        Escreva("Origem: ", getNacionalidade())
        Escreva(getIdade(), " anos")
        Escreva(getAltura(), " m de altura")
        Escreva("Pesando ", getPeso(), "Kg")
        Escreva("Ganhou: ", getVitorias())
        Escreva("Perdeu: ", getDerrotas())
        Escreva("Empatou: ", getEmpates())
    fim metodo
    
    publico metodo status()
        Escreva(getNome())
        Escreva("é um peso ", getCategoria))
        Escreva(getVitorias(), "vitórias")
        Escreva(getDerrotas(), "derrotas")
        Escreva(getEmpates(), "empates")
    fim metodo
    
    publico metodo ganharLuta()
        setVitorias(getVitorias() + 1)
    fim metodo
    
    publico metodo perderLuta()
        setDerrotas(getDerrotas() + 1)
    fim metodo
    
    publico metodo empatarLuta()
        setEmpates(getEmpates() + 1)
    fim metodo
    
    // Métodos Especiais
        publico metodo construtor (no:Caractere, na:Caractere, id:Inteiro, al:Real,
        nome = no               pe: Real, vi:Inteiro, de:Inteiro, em:Inteiro)
        nacionalidade = na
        idade = id
        altura = al
        setPeso(pe)
        vitorias = vi
        derrotas = de
        empates = em
    fim metodo
    
    
    publico metodo getNome()
        retorne nome
    fim metodo
    
    publico metodo setNome(no:Caractere)
        nome = no
    fim metodo
    
    
    publico metodo getPeso()
        retorne peso
    fim metodo
    
    publico metodo setPeso(pe:Caractere)
        peso = pe
        setCategoria()
    fim metodo
    
    
    publico metodo setCategoria()
        se(peso<52.2) então
            categoria = "Inválido"
        senão se(peso<=70.3) então
            categoria = "Leve"
        senão se (peso<=83.9) então
            categoria = "Médio"
        senão se (peso<=120.2) então
            categoria = "Pesado"
        senão
            categoria = "Inválido"
        fim se
    fim metodo
    
    publico metodo setPeso(pe:Caractere)
        peso = pe
    fim metodo

segunda classe

    |-----------------|
    |      Luta       |
    |-----------------|
    | -  desafiado    |
    | -  desafiante   |
    | -  rounds       |
    | -  aprovada     |
    |-----------------|
    | + marcarLuta()  |
    | + lutar()       |
    |-----------------|

    classe Luta
    // Atributos
    privado desafiado: Lutador
    privado desafiante: Lutador
    privado rounds: Inteiro
    privado aprovado: Lógico
    
    // Métodos
    publico metodo marcarLuta(l1, l2: Lutador)
        se (l1.getCategoria() = l2.getCategoria())
            e (l1 <> l2) então
            aprovado = verdadeiro
            desafiado = l1
            desafiante = l2
        senão
            aprovado = falso
            desafiado = nulo
            desafiante = nulo
        fim se
    fim metodo
    
    
    publico metodo lutar()
        se (aprovada)
            desafiado.apresentar()
            desafiante.apresentar()
            vencedor = aleatório(0..2)
            escolha (vencedor)
                caso 0: //Empate
                    Escreva("Empatou!")
                    desafiado.empatarLuta()
                    desafiante.empatarLuta()
                caso 1: //Ganhou o Desafiado
                    Escreva(desafiado.getNome())
                    desafiado.ganharLuta()
                    desafiante.perderLuta()
                caso 2: //Ganhou o Desafiaante
                    Escreva(desafiante.getNome())
                    desafiante.ganharLuta()
                    desafiado.perderLuta()
            fim escolha 
        senão
            Escreva("Luta não pode acontecer")
        fim se
    fim metodo

     // Métodos Especiais
    publico metodo setDesafiado(dd: Lutador)
        desafiado = dd
    fim metodo
    
    publico metodo getDesafiado()
        retorne desafiado
    fim metodo
    (...)
    FimClasse
