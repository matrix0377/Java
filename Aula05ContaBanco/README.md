Projeto em Java 
Programação Orientada a Objetos

Conceitos aplicados:
- Diagrama de Classe
- Algorítmo
- Pilar Encapsulamento



<h3> Exemplo do Banco </h3>
 -----------------------

<br> CC -> Conta corrente
<br> CP -> Conta Poupança


<br> Diagrama de Classe



    |-----------------------------|
    |         ContaBanco          |
    |-----------------------------|
    | +  numConta                 |
    | #  tipo                     |
    | -  dono                     |
    | -  saldo                    |
    | -  status                   |
    |-----------------------------|
    | +  abrirConta()             |
    | +  fecharConta()            |
    | +  depositar()              |
    | +  sacar()                  |
    | +  pagarMensal()            |
    |                             |
    |   getnumConta()             |
    |   setnumConta()             |
    |   getTipo()                 |
    |   setTipo()                 |
    |   getDono()                 |
    |   setDono()                 |
    |   getSaldo()                |
    |   setSaldo()                |
    |   ...                       |
    |-----------------------------|




<br> ALGORÍTMO


    Classe ContaBanco
        // Atributos
        publico numConta: Inteiro
        protegido tipo: Caractere
        privado dono: Caractere
        privado saldo: Real
        privado status: Logico
        // Métodos
        publico Metodo abrirConta(t:Caractere)
            setTipo(t)
            setStatus(verdadeiro)
            se (t = "CC") entao
                saldo = 50
            senao se (t = "CP") entao
                saldo = 150
            FimSe
        FimMetodo
        publico Metodo fecharConta()
            se (saldo > 0) entao
                Escreva("Conta com dinheiro")
            senao se (saldo < 0) entao
                Escreva("Conta em débito")
            senao
                setStatus(false)
            FimSe
        FimMetodo    
        publico Metodo depositar(v:Real)
            se (status = verdadeiro) entao
                saldo = saldo + v // ou setSaldo(getSaldo() + v)
            senao
                Escreva("Impossível depositar")
            FimSe
        FimMetodo    
        publico Metodo sacar(v:Real)
            se (status = verdadeiro) entao
                se (saldo > v) entao
                    saldo = saldo -v
                senao
                    Escreva("Saldo insuficiente")
                FimSe
            senao
                Escreva("Impossível sacar")
            FimSe
        FimMetodo    
        publico Metodo pagarMensal()
            var v: Real
            se (tipo = "CC") entao
                v = 12
            senao se (tipo = "CP") entao
                v = 20
            fimse
            se (status = verdadeiro) entao
                se (saldo > v) entao
                    saldo = saldo - v
                senao
                    Escreva("Saldo insuficiente")
                FimSe
            senao
                Escreva("Impossível pagar")
            FimSe
        FimMetodo    
        // Métodos Especiais    
        publico Metodo Construtor()
            saldo = 0
            staus = falso
        FimMetodo    
        publico Metodo setNumConta(n:Inteiro)
            numConta = n
        FimMetodo    
        publico Metodo getNumConta()
            retorne numConta
        FimMetodo    
        publico Metodo setTipo(t:Caractere)
            tipo = t
        FimMetodo    
        publico Metodo getTipo()
            retorne tipo
        FimMetodo    
        publico Metodo setDono(d:Caractere)
            dono = d
        FimMetodo    
        publico Metodo getDono()
            retorne dono
        FimMetodo    
        publico Metodo setSaldo(s:Real)
            saldo = s
        FimMetodo    
        publico Metodo getSaldo()
            retorne saldo
        FimMetodo    
        publico Metodo setStatus(s:Logico)
            status = s
        FimMetodo    
        publico Metodo getStatus()
            retorne status
        FimMetodo
      FimClasse

    


