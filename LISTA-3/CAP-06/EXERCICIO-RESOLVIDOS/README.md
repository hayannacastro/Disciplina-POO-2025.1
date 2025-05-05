# Questão 1.
Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.

###### Solução:
##### ALGORITMO
##### DECLARE num[9] NUMÉRICO
#####         i, j, cont NUMÉRICO
##### 
##### PARA i ← 1 ATÉ 9 FAÇA
#####     INÍCIO
#####         LEIA num[i]
#####     FIM
##### 
##### PARA i ← 1 ATÉ 9 FAÇA
#####     INÍCIO
#####         cont ← 0
#####         PARA j ← 1 ATÉ num[i] FAÇA
#####             INÍCIO
#####                 SE RESTO(num[i]/j) = 0
#####                     ENTÃO cont ← cont + 1
#####             FIM
#####         SE cont <= 2
#####             ENTÃO INÍCIO
#####                 ESCREVA num[i]
#####                 ESCREVA i
#####             FIM
#####     FIM
##### 
##### FIM_ALGORITMO.


# Questão 2.
Uma pequena loja de artesanato possui um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$45,00, acrescido de 5% do valor total de suas vendas. O valor unitário dos objetos deve ser informado e armazenado em um vetor, a quantidade vendida de cada peça deve ficar em outro vetor, na mesma posição. Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre:

° um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto.

° o valor do total das vendas e o valor da comissão que será paga ao vendedor.

° o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).

###### Solução:

##### ALGORITMO
##### DECLARE qtd[10], preco[10] NUMÉRICO
#####         i, tot_geral, tot_vend, comissao, maior, ind NUMÉRICO
##### 
##### tot_geral ← 0
##### PARA i ← 1 ATÉ 10 FAÇA
#####     INÍCIO
#####         LEIA qtd[i]
#####     FIM
##### 
##### PARA i ← 1 ATÉ 10 FAÇA
#####     INÍCIO
#####         LEIA preco[i]
#####     FIM
##### 
##### PARA i ← 1 ATÉ 10 FAÇA
#####     INÍCIO
#####         tot_vend ← qtd[i] * preco[i]
#####         ESCREVA qtd[i], preco[i], tot_vend
#####         tot_geral ← tot_geral + tot_vend
#####     FIM
##### 
##### comissao ← tot_geral * 5 / 100
##### ESCREVA tot_geral, comissao
##### 
##### maior ← qtd[1]
##### ind ← 1
##### PARA i ← 2 ATÉ 10 FAÇA
#####     INÍCIO
#####         SE qtd[i] > maior
#####             ENTÃO INÍCIO
#####                 maior ← qtd[i]
#####                 ind ← i
#####             FIM
#####     FIM
##### 
##### ESCREVA preco[ind], ind
##### FIM_ALGORITMO.


# Questão 3.
Faça um programa que receba dois números e mostre o maior.

###### Solução:
##### ALGORITMO
#####     DECLARE num1, num2 NUMÉRICO
#####     ESCREVA "Digite o primeiro número: "
#####     LEIA num1
#####     ESCREVA "Digite o segundo número: "
#####     LEIA num2
#####     SE num1 > num2
#####         ENTÃO ESCREVA "O maior número é: ", num1
#####     SENÃO
#####         SE num2 > num1
#####             ENTÃO ESCREVA "O maior número é: ", num2
#####         SENÃO
#####             ESCREVA "Os números são iguais."
##### FIM_ALGORITMO.


# Questão 4.
Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário digitará três números diferentes.

###### Solução:
##### ALGORITMO
#####     DECLARE num1, num2, num3 NUMÉRICO
#####     ESCREVA "Digite o primeiro número: "
#####     LEIA num1
#####     ESCREVA "Digite o segundo número: "
#####     LEIA num2
#####     ESCREVA "Digite o terceiro número: "
#####     LEIA num3
#####     
#####     SE num1 < num2 E num1 < num3
#####         ENTÃO
#####             SE num2 < num3
#####                 ENTÃO ESCREVA num1, num2, num3
#####                 SENÃO ESCREVA num1, num3, num2
#####     SENÃO
#####         SE num2 < num1 E num2 < num3
#####             ENTÃO
#####                 SE num1 < num3
#####                     ENTÃO ESCREVA num2, num1, num3
#####                     SENÃO ESCREVA num2, num3, num1
#####         SENÃO
#####             SE num1 < num2
#####                 ENTÃO ESCREVA num3, num1, num2
#####                 SENÃO ESCREVA num3, num2, num1
##### FIM_ALGORITMO.

