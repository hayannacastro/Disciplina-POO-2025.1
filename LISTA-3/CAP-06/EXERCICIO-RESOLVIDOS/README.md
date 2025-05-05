## 1.1. Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números
primos e suas respectivas posições.

algoritmo
DECLARE num[9] NUMÉRICO
DECLARE i, j, cont NUMÉRICO

PARA i ← 1 ATÉ 9 FAÇA
    INÍCIO
    LEIA num[i]
    FIM

PARA i ← 1 ATÉ 9 FAÇA
    INÍCIO
    cont ← 0
    PARA j ← 1 ATÉ num[i] FAÇA
        INÍCIO
        SE RESTO(num[i]/j) = 0 ENTÃO
            cont ← cont + 1
        FIM
    SE cont <= 2 ENTÃO
        INÍCIO
        ESCREVA num[i]
        ESCREVA i
        FIM
    FIM
FIM_ALGORITMO


## 2.
