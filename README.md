# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Prova Prática 2

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

### Compilando

Execute o comando abaixo a partir da raiz do repositório:

```bash
javac src/main/java/*.java
```

### Executando os testes públicos

Depois de compilar, execute:

```bash
java -ea -cp src/main/java Asserts
```

> A opção `-ea` habilita os `asserts` usados nos testes.


## A Prova

### remove(int index) em ArrayList (5,0)

Implemente o método `public void remove(int index)` na classe ArrayList. Dada uma lista, 
este método remove o valor que está no índice `index`. Você vai precisar implementar um método auxiliar `shiftLeft` para ajustar a lista depois da remoção.

### remove(int index) em LinkedList (5,0)

Implemente o método `public void remove(int index)` na classe LinkedList. Dada uma lista, 
este método remove o valor que está no índice `index`. Lembre-se que LinkedList não é implementada por array, então você vai precisar iterar até a posição que deseja remover.

## Entregando a prova

> Passo 0. Modifique o arquivo README. Coloque seu nome, email @ccc e matrícula nos lugares indicados. Se você não fizer isso, não considero que sua prova foi assinada e, portanto, não vou corrigir. Não mude a formatação da linha. Apenas inclua seus dados.

> Passo 1. Certifique-se **NO TERMINAL** de que sua solução compila e passa nos testes. Isso deve ser feito com os comandos acima (`javac` e `java -ea`).

> ⚠️ **Importante:** Os comandos abaixo devem ser executados no **diretório pai** do projeto, ou seja, no diretório anterior ao diretório `pp2-20262/`.

> Passo 2. Gere o arquivo compactado da sua solução:

```bash
tar zcvf nome-sobrenome-matricula.tar.gz pp2-20262/
```

> Passo 3. Confira se o tar foi gerado corretamente, listando os arquivos que estão dentro dele (sem extrair):

```bash
tar tzvf nome-sobrenome-matricula.tar.gz
```

> Confira se a listagem mostra o diretório `pp2-20262/` com todo o seu conteúdo (README.md, src/, etc). Se a lista vier vazia ou incompleta, o arquivo foi gerado errado e sua prova não será corrigida.

> Passo 4. Submeta sua solução:

```bash
bash pp2-20262/submit-answer.sh pp2 nome-sobrenome-matricula.tar.gz
```

Importante: a senha é `leda`

## Importante

* A correção da prova não é automática. Os testes que são executados quando você roda localmente são apenas testes de sanidade.

* Vou considerar sempre a última submissão antes do deadline final. 

* A nota será dada pelos testes no servidor e depois da correção que eu efetuar. Sempre tento corrigir o mais rápido possível. Portanto, tenha paciência.

* A nota será calculada a partir dos testes e análise manual do código. Essa análise manual vai considerar se a solução é eficiente, se não tem loops desnecessários etc.

* Só serão corrigidas as provas dos alunos que assinaram a lista de presença física no laboratório.
