## 1. Verificar se um número é positivo ou negativo
Descrição: Crie uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se for negativo.

Algoritmo:

ALGORITMO
DECLARE num, x NUMÉRICO
LEIA num
x ← verifica(num)
SE x = 0
ENTÃO ESCREVA "Número positivo"
SENÃO ESCREVA "Número negativo"
FIM_ALGORITMO.

SUB-ROTINA verifica(num NUMÉRICO)
DECLARE res NUMÉRICO
SE num >= 0
ENTÃO res ← 1
SENÃO res ← 0
RETORNE res
FIM_SUB_ROTINA verifica

