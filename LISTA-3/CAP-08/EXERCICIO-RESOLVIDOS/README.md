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


## 2. Somar números inteiros entre dois valores
Descrição: Crie uma sub-rotina que receba dois números positivos como parâmetros e retorne a soma dos inteiros entre eles.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE num1, num2, s NUMÉRICO
LEIA num1, num2
s ← somar(num1, num2)
ESCREVA "soma = ", s
FIM_ALGORITMO.

SUB-ROTINA somar(num1, num2 NUMÉRICO)
DECLARE i, s NUMÉRICO
s ← 0
PARA i ← num1+1 ATÉ num2-1 FAÇA
    INÍCIO
    s ← s + i
FIM
RETORNE s
FIM_SUB_ROTINA somar


## 3. Somar múltiplos de um número entre dois valores
Descrição: Crie uma sub-rotina que receba três números inteiros a, b e c, sendo a maior que 1, e calcule a soma de todos os números divisíveis por a entre b e c.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE a, b, c, result NUMÉRICO
REPITA
    LEIA a
ATÉ a > 1
LEIA b, c
result ← divisores(a, b, c)
ESCREVA "Soma dos inteiros = ", result
FIM_ALGORITMO.

SUB-ROTINA divisores(a, b, c NUMÉRICO)
DECLARE i, s, r NUMÉRICO
s ← 0
PARA i ← b ATÉ c FAÇA
    INÍCIO
    r ← RESTO(i / a)
    SE r = 0
        ENTÃO s ← s + i
FIM
RETORNE s
FIM_SUB_ROTINA divisores

## 4. Converter segundos em horas, minutos e segundos
Descrição: Crie uma sub-rotina que converta um valor em segundos para horas, minutos e segundos.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE seg NUMÉRICO
LEIA seg
transformacao(seg);
FIM_ALGORITMO.

SUB-ROTINA transformacao(segundos NUMÉRICO)
DECLARE h, m, s, r NUMÉRICO
h ← segundos / 3600
r ← RESTO(segundos / 3600)
m ← r / 60
s ← RESTO(r / 60)
ESCREVA h, m, s
FIM_SUB_ROTINA transformacao


## 5. Calcular o percentual de acréscimo de um produto
Descrição: Crie um programa que receba os valores antigo e atual de um produto e calcule o percentual de aumento entre esses valores.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE precoantigo, precoatual, acrescimo NUMÉRICO
LEIA precoantigo
LEIA precoatual
acrescimo ← calculo_reajuste(precoantigo, precoatual)
ESCREVA acrescimo
FIM_ALGORITMO.

SUB-ROTINA calculo_reajuste(PA, PN NUMÉRICO)
DECLARE result NUMÉRICO
result ← (100 * PN – 100 * PA) / PA
RETORNE result
FIM_SUB_ROTINA calculo_reajuste


## 6. Tabela de multiplicação
Descrição: Crie uma sub-rotina que exiba a tabela de multiplicação de um número de 1 a 9.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE num NUMÉRICO
REPITA
    LEIA num
ATÉ (num >= 1) E (num <= 9)
multiplicacao(num)
FIM_ALGORITMO.

SUB-ROTINA multiplicacao(n NUMÉRICO)
DECLARE i, j NUMÉRICO
PARA i ← 1 ATÉ n FAÇA
    INÍCIO
    PARA j ← 1 ATÉ i FAÇA
        INÍCIO
        ESCREVA i * j
    FIM
FIM
FIM_SUB_ROTINA multiplicacao


## 7. Calcular a média aritmética ou ponderada de um aluno
Descrição: Crie uma sub-rotina que calcule a média aritmética ou ponderada das notas de um aluno, dependendo da escolha de uma letra.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE nota1, nota2, nota3, m NUMÉRICO
letra LITERAL
LEIA nota1
LEIA nota2
LEIA nota3
REPITA
    LEIA letra
ATÉ (letra = "A") OU (letra = "P")
m ← calcula_media(nota1, nota2, nota3, letra)
SE letra = "A"
    ENTÃO ESCREVA "A média aritmética ", m
SENÃO ESCREVA "A média ponderada ", m
FIM_ALGORITMO.

SUB-ROTINA calcula_media(n1, n2, n3 NUMÉRICO, l LITERAL)
DECLARE media NUMÉRICO
SE l = "A"
    ENTÃO media ← (n1+n2+n3)/3
SENÃO media ← (n1*5+n2*3+n3*2)/(5+3+2)
RETORNE media
FIM_SUB_ROTINA calcula_media


## 8. Calcular a duração de um jogo
Descrição: Crie uma sub-rotina que calcule a duração de um jogo, considerando o horário de início e de término, com a possibilidade de começar em um dia e terminar no outro.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE hora_i, min_i, hora_f, min_f, minutos NUMÉRICO
LEIA hora_i, min_i
LEIA hora_f, min_f
minutos ← calculo(hora_i, min_i, hora_f, min_f)
ESCREVA minutos
FIM_ALGORITMO.

SUB-ROTINA calculo(h_i, m_i, h_f, m_f NUMÉRICO)
DECLARE tot_h, tot_m, total NUMÉRICO
SE m_f < m_i
    ENTÃO
    m_f ← m_f + 60
    h_f ← h_f - 1
FIM
SE h_f < h_i
    ENTÃO
    h_f ← h_f + 24
FIM
tot_m ← m_f - m_i
tot_h ← h_f - h_i
total ← tot_h * 60 + tot_m
RETORNE total
FIM_SUB_ROTINA calculo


## 9. Encontrar o maior e o menor valor entre cinco números
Descrição: Crie uma sub-rotina que leia cinco valores inteiros e determine o maior e o menor entre eles.

Algoritmo:

pascal
Copiar
Editar
ALGORITMO
maior_menor;
FIM_ALGORITMO.

SUB-ROTINA maior_menor
DECLARE i, num, maior, menor NUMÉRICO
PARA i ← 1 ATÉ 5 FAÇA
    INÍCIO
    ESCREVA "Digite o ", i, "o número: "
    LEIA num
    SE i = 1
        ENTÃO
        maior ← num
        menor ← num
    FIM
    SENÃO
        SE num > maior
            ENTÃO maior ← num
        SE num < menor
            ENTÃO menor ← num
    FIM
FIM
ESCREVA "O maior número digitado foi: ", maior
ESCREVA "O menor número digitado foi: ", menor
FIM_SUB_ROTINA maior_menor


## 10. Calcular a sequência de 1 + 1/1! + 1/2! + ... + 1/N!
Descrição: Crie uma sub-rotina que receba um número inteiro positivo N e calcule a sequência:

ini
Copiar
Editar
S = 1 + 1/1! + 1/2! + ... + 1/N!
Algoritmo:

pascal
Copiar
Editar
ALGORITMO
DECLARE num, s NUMÉRICO
LEIA num
s ← sequencia(num)
ESCREVA s
FIM_ALGORITMO.

SUB-ROTINA sequencia(n NUMÉRICO)
DECLARE a, b, f, seq NUMÉRICO
seq ← 1
PARA a ← 1 ATÉ n FAÇA
    INÍCIO
    f ← 1
    PARA b ← 1 ATÉ a FAÇA
        INÍCIO
        f ← f * b
    FIM
    seq ← seq + 1 / f
FIM
RETORNE seq
FIM_SUB_ROTINA sequencia
