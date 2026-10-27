# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Prova Prática 2

## O template

> Não altere o arquivo build.gradle

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/test/java/**

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `gradle compileJava` na raiz do projeto

> Executando os testes: `gradle test` na raiz do projeto


## A Prova

### remove(int index) em ArrayList (2,5)

Implemente o método `public void remove(int index)` na classe ArrayList. Dada uma lista, 
este método remove o valor que está no índice `index`. Você vai precisar implementar um método auxiliar `shiftLeft` para ajustar a lista depois da remoção.

### remove(int index) em LinkedList (2,5)

Implemente o método `public void remove(int index)` na classe LinkedList. Dada uma lista, 
este método remove o valor que está no índice `index`. Lembre-se que LinkedList não é implementada por array, então você vai precisar iterar até a posição que deseja remover.


### 


### Teoria

* (1.0) Quais as principais diferenças entre ArrayList e LinkedList?

  ```diff
  - INSIRA SUA RESPOSTA AQUI
  ```

* (2.0) Escreva em pseudocódigo (não precisa se preocupar com detalhes de Java) o método `boolean contains(int key)` da classe HashMap, cuja estratégia de resolução de colisão é feita por endereçamento aberto com sondagem linear. 
  ```diff
  - INSIRA SUA RESPOSTA AQUI
  ```

*  (2.0) No pior caso, qual será a classe de complexidade do método que você implementou? Quais estratégias são utilizadas para garantir uma alta probabilidade de não cair nesse caso?

  ```diff
  - INSIRA SUA RESPOSTA AQUI
  ```

## Entregando a prova

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos do gradle (compileJava e test) ou `mvn test`.

> Passo 2. Submeta sua solução para o repositório

  * `git pull`
  * `git commit -m "entregando a prova 1"`
  * `git push origin main`

## Importante

* A correção da prova não é automática. Os testes que são executados quando você faz push são apenas testes de sanidade.

* Vou considerar sempre a última submissão antes do deadline final. 

* A nota será dada pelos testes no servidor e depois da correção que eu efetuar. Sempre tento corrigir o mais rápido possível. Portanto, tenha paciência.

* A nota será calculada a partir dos testes e análise manual do código. Essa análise manual vai considerar se a solução é eficiente, se não tem loops desnecessários etc.

* Só serão corrigidas as provas dos alunos que assinaram a lista de presença física no laboratório.
