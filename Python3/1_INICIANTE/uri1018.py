"""
Cédulas
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser
decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
necessárias.
Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem:
 “Presentation Error”.
"""

valor = int(input())
print(valor)

numeroNotas100 = 0
numeroNotas50 = 0
numeroNotas20 = 0
numeroNotas10 = 0
numeroNotas5 = 0
numeroNotas2 = 0
numeroNotas1 = 0

numeroNotas100 = valor//100
valor = valor-numeroNotas100*100

numeroNotas50 = valor//50
valor = valor-numeroNotas50*50

numeroNotas20 = valor//20
valor = valor-numeroNotas20*20

numeroNotas10 = valor//10
valor = valor-numeroNotas10*10

numeroNotas5 = valor//5
valor = valor-numeroNotas5*5

numeroNotas2 = valor//2
valor = valor-numeroNotas2*2

numeroNotas1 = valor//1
valor = valor-numeroNotas1*1

print("{} nota(s) de R$ 100,00".format(numeroNotas100))
print("{} nota(s) de R$ 50,00".format(numeroNotas50))
print("{} nota(s) de R$ 20,00".format(numeroNotas20))
print("{} nota(s) de R$ 10,00".format(numeroNotas10))
print("{} nota(s) de R$ 5,00".format(numeroNotas5))
print("{} nota(s) de R$ 2,00".format(numeroNotas2))
print("{} nota(s) de R$ 1,00".format(numeroNotas1))

"""
#Esta é outra forma de resolver

valor = int(input())
print(valor)

numeroNotas100 = 0
numeroNotas50 = 0
numeroNotas20 = 0
numeroNotas10 = 0
numeroNotas5 = 0
numeroNotas2 = 0
numeroNotas1 = 0

while(valor>99):
    numeroNotas100 += 1
    valor -= 100

while(valor>49):
    numeroNotas50 += 1
    valor -= 50

while(valor>19):
    numeroNotas20 += 1
    valor -= 20

while(valor>9):
    numeroNotas10 += 1
    valor -= 10

while(valor>4):
    numeroNotas5 += 1
    valor -= 5

while(valor>1):
    numeroNotas2 += 1
    valor -= 2

while(valor>0):
    numeroNotas1 += 1
    valor -= 1

print("{} nota(s) de R$ 100,00".format(numeroNotas100))
print("{} nota(s) de R$ 50,00".format(numeroNotas50))
print("{} nota(s) de R$ 20,00".format(numeroNotas20))
print("{} nota(s) de R$ 10,00".format(numeroNotas10))
print("{} nota(s) de R$ 5,00".format(numeroNotas5))
print("{} nota(s) de R$ 2,00".format(numeroNotas2))
print("{} nota(s) de R$ 1,00".format(numeroNotas1))

#print("%d nota(s) de R$ 100,00" %numeroNotas100)
#print("%d nota(s) de R$ 50,00" %numeroNotas50)
#print("%d nota(s) de R$ 20,00" %numeroNotas20)
#print("%d nota(s) de R$ 10,00" %numeroNotas10)
#print("%d nota(s) de R$ 5,00" %numeroNotas5)
#print("%d nota(s) de R$ 2,00" %numeroNotas2)
#print("%d nota(s) de R$ 1,00" %numeroNotas1)
"""
