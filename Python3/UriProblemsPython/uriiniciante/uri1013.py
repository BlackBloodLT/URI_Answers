"""
O Maior
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:
Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para
chegar no resultado esperado.
Entrada
O arquivo de entrada contém três valores inteiros.
Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
"""

def maiorAB(valorA,valorB):
    valorMaior = ((valorA)+(valorB)+(abs(valorA-valorB)))/2
    return(valorMaior)

entrada = input().split(" ")

valorA = int(entrada[0])
valorB = int(entrada[1])
valorC = int(entrada[2])

#print(valorA)
#print(valorB)
#print(valorC)

maior = maiorAB(valorA,valorB)
maior = maiorAB(maior,valorC)

print("%d eh o maior" %maior)