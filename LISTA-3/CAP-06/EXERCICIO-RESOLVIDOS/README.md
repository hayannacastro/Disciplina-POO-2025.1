## 1. Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números
primos e suas respectivas posições.

Solução:
ALGORITMO

DECLARE num[9] NUMÉRICO

i, j, cont NUMÉRICO

PARA i ← 1 ATÉ 9 FAÇA

INÍCIO

LEIA num[i]

FIM

PARA i ← 1 ATÉ 9 FAÇA

INÍCIO

cont ← 0

PARA j ← 1 ATÉ num[i] FAÇA

INÍCIO

SE RESTO(num[i]/j) = 0

ENTÃO cont ← cont + 1

FIM

SE cont <= 2

ENTÃO INÍCIO

ESCREVA num[i]

ESCREVA i

FIM


## 2. Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O
vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas.
O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de
cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços
e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez).
Depois, determine e mostre:

■■ um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final,
deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e

■■ o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).


Solução:
ALGORITMO

DECLARE qtd[10], preco[10] NUMÉRICO

i, tot_geral, tot_vend, comissao, maio, ind NUMÉRICO

tot_geral ← 0

PARA i ← 1 ATÉ 10 FAÇA

INÍCIO

LEIA qtd[i]

LEIA preco[i]

FIM

PARA i ← 1 ATÉ 10 FAÇA

INÍCIO

tot_vend ← qtd[i] * preco[i]

ESCREVA qtd[i], preço[i], tot_vend

tot_geral ← tot_geral + tot_vend

FIM

comissão ← tot_geral * 5 /100

ESCREVA tot_geral, comissao

maior ← qtd[1]

ind ← 1

PARA i ← 2 ATÉ 10 FAÇA

INÍCIO

SE qtd[i] > maior

ENTÃO INÍCIO

maior ← qtd[i]

ind ← i

FIM

FIM

ESCREVA preco[ind], ind

FIM_ALGORITMO.

FIM

FIM_ALGORITMO.


## 3. Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetorresultante
da intercalação deles.

Vetor 1 3 5 4 2 2 5 3 2 5 9
1 2 4 4 5 6 7 8 9 10

Vetor 2 7 15 20 0 18 4 55 23 8 6
1 2 4 4 5 6 7 8 9 10

Vetor resultante da intercalação

3 7 5 15 4 20 2 0 2 18 5 4 3 55 2 23 5 8 9 6
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

Solução:
ALGORITMO

DECLARE vet1[10], vet2[10], vet3[20] NUMÉRICO

i, j NUMÉRICO

j ← 1

PARA i ← 1 ATÉ 10 FAÇA

INÍCIO

LEIA vet1[i]

vet3[j] ← vet1[i]

j ← j + 1

LEIA vet2[i]

vet3[j] ← vet2[i]

j ← j + 1

FIM

PARA i ← 1 ATÉ 20 FAÇA

INÍCIO

ESCREVA vet3[i]

FIM

FIM_ALGORITMO.


## 
