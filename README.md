## CURSO INTRODUTÓRIO COLLECTIONS FRAMEWORK JAVA

#### Java Collections Framework e hierarquia

🔸 List
```
Coleção com iterações ordenadas: List
Conhecendo os métodos
Ordenação da coleção List
```
### exercicios propostos:
1- Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).

2- Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".

🔸 Set
```
Coleção com singularidade: Set
Conhecendo os métodos
Ordenação da coleção Set
```

### exercicios propostos:

1- Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;

2- Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.


🔸 Map
```
Coleção de pares: Map
Conhecendo os métodos
Ordenação de Map
```
### exercicio:

1- Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432

2- Complementar
Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;

3- Complementar
Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com o seguintes requisito:
Key: Nome do aluno e matrícula - Value: Nome das disciplinas na qual estão matriculados


### exercicios propostos:
1- Dada a população estimada de alguns estados do nordeste brasileiro, faça:
Estado = PE - população = 9.616.621
Estado = AL - população = 3.351.543
Estado = CE - população  = 9.187.103
Estado = RN - população = 3.534.265
1. "Crie um dicionário que relacione os estados e suas respectivas populações"
2. "Substitua a população do estado RN por : 3.534.165"
3. "Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione"
4. "Exiba a população do estado PE"
5. "Já trabalhou com a vítima?"
6. "Exiba todos os estados e suas populaçãos na ordem em que foram informados"
7. "Exiba todos os estados e suas populações na ordem alfabética"
8. "Exiba o estado com o menor população %s e seu respectivo valor %d"
9. "Exiba o estado com a maior população %s e seu respectivo valor %d"
10. "Exiba a soma da população desses estados"
11. "Exiba a média da população deste dicionário de estados"
12. "Remova os estados com a população menor que 4.000.000"
13. "Apague o dicionario de estados com suas respectivas populações estimadas"
14. "Confira se a lista está vazia"

2- Faça um programa que simule um lançamento de dados. 
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.

3- Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato) ||
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
1. "Ordem aleatória"
2. "Ordem Inserção"
3. "Ordem id"
4. "Ordem número telefone"
5. "Ordem nome contato"

🔸 Stream API
```
Visão geral: Classe Anônima - Functional Interface - Lambda - Method Reference
Stream API
Conhecendo as operações
```
