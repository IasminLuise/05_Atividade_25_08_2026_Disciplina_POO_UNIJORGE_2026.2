Contexto:

Uma empresa responsável pela venda de ingressos para eventos precisa desenvolver um programa simples para registrar uma compra.

O sistema deverá solicitar ao usuário:

Quantidade de ingressos que deseja comprar;
Valor unitário do ingresso;
Calcular e apresentar o valor total da compra.

Durante a execução, podem ocorrer erros, como o usuário informar texto no lugar de um número. O programa não deve ser encerrado inesperadamente. Para isso, deverá utilizar try-catch.

Ao final da execução, independentemente de ocorrer ou não um erro, o sistema deverá apresentar uma mensagem informando que o processo de venda foi encerrado, utilizando finally.

Objetivo da atividade

Desenvolver um programa em Java capaz de realizar o cálculo de uma venda, utilizando estruturas de tratamento de exceções:

try para executar as operações que podem gerar erro;
catch para tratar possíveis exceções;
finally para executar uma ação que deve ocorrer independentemente de erro.

Regras do sistema
Solicitar a quantidade de ingressos.
Solicitar o valor de cada ingresso.

Calcular o valor total:

total = quantidade × valor

Exibir o total da compra.
Caso o usuário informe um valor inválido, apresentar uma mensagem de erro.
O bloco finally deverá informar que o processo foi finalizado.

Exemplo de execução correta
Informe a quantidade de ingressos: 3
Informe o valor do ingresso: 50

Quantidade de ingressos: 3
Valor unitário: R$ 50.0
Total da compra: R$ 150.0

Processo de venda finalizado.

Exemplo de execução com erro

Informe a quantidade de ingressos: três
Erro: entrada inválida. Informe um número.
Processo de venda finalizado.
