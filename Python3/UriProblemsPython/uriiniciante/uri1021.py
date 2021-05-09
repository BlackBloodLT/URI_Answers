"""
Notas e Moedas
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o
menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20,
10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.
"""

# Está com erro, verificar e corrigir!!!
valor = float(input())

numeroNotas100 = valor//100
valor -= numeroNotas100*100

numeroNotas50 = valor//50
valor -= numeroNotas50*50

numeroNotas20 = valor//20
valor -= numeroNotas20*20

numeroNotas10 = valor//10
valor -= numeroNotas10*10

numeroNotas5 = valor//5
valor -= numeroNotas5*5

numeroNotas2 = valor//2
valor -= numeroNotas2*2

numeroMoedas100 = valor//1
valor -= numeroMoedas100*1
numeroMoedas100=float("%.2f" %numeroMoedas100)
valor=float("%.2f"% valor)

numeroMoedas50 = valor//0.5
valor -= numeroMoedas50*0.5
numeroMoedas50=float("%.2f" %numeroMoedas50)
valor=float("%.2f"% valor)

numeroMoedas25 = valor//0.25
valor -= numeroMoedas25*0.25
numeroMoedas25=float("%.2f" %numeroMoedas25)
valor=float("%.2f" %valor)

numeroMoedas10 = valor // 0.10
valor -= numeroMoedas10*0.10
numeroMoedas10=float("%.2f" %numeroMoedas10)
valor=float("%.2f"% valor)

numeroMoedas5 = valor // 0.05
valor -= numeroMoedas5*0.05
numeroMoedas5=float("%.2f" %numeroMoedas5)
valor=float("%.2f"% valor)

numeroMoedas1 = valor * 100
numeroMoedas1 = float("%.2f" %numeroMoedas1)
valor=float("%.2f" %valor)

print('NOTAS:')
print('{} nota(s) de R$ 100.00'.format(int(numeroNotas100)))
print('{} nota(s) de R$ 50.00'.format(int(numeroNotas50)))
print('{} nota(s) de R$ 20.00'.format(int(numeroNotas20)))
print('{} nota(s) de R$ 10.00'.format(int(numeroNotas10)))
print('{} nota(s) de R$ 5.00'.format(int(numeroNotas5)))
print('{} nota(s) de R$ 2.00'.format(int(numeroNotas2)))
print('MOEDAS:')
print('{} moeda(s) de R$ 1.00'.format(int(numeroMoedas1)))
print('{} moeda(s) de R$ 0.50'.format(int(numeroMoedas50)))
print('{} moeda(s) de R$ 0.25'.format(int(numeroMoedas25)))
print('{} moeda(s) de R$ 0.10'.format(int(numeroMoedas10)))
print('{} moeda(s) de R$ 0.05'.format(int(numeroMoedas5)))
print('{} moeda(s) de R$ 0.01'.format(int(numeroMoedas1)))

"""
entrada = float(input())
valor = int(entrada*100)

numeroNotas100 = 0
numeroNotas50 = 0
numeroNotas20 = 0
numeroNotas10 = 0
numeroNotas5 = 0
numeroNotas2 = 0
numeroNotas1 = 0

numeroMoedas100 = 0
numeroMoedas50 = 0
numeroMoedas25 = 0
numeroMoedas10 = 0
numeroMoedas5 = 0
numeroMoedas1 = 0

while(valor>9999):
    numeroNotas100 += 1
    valor -= 10000

while(valor>4999):
    numeroNotas50 += 1
    valor -= 5000

while(valor>1999):
    numeroNotas20 += 1
    valor -= 2000

while(valor>999):
    numeroNotas10 += 1
    valor -= 1000

while(valor>499):
    numeroNotas5 += 1
    valor -= 500

while(valor>199):
    numeroNotas2 += 1
    valor -= 200
while(valor>99):
    numeroMoedas100 += 1
    valor -= 100

while(valor>49):
    numeroMoedas50 += 1
    valor -= 50

while(valor>24):
    numeroMoedas25 += 1
    valor -= 25

while(valor>9):
    numeroMoedas10 += 1
    valor -= 10

while(valor>4):
    numeroMoedas5 += 1
    valor -= 5

while(valor>0):
    numeroMoedas1 += 1
    valor -= 1

print("NOTAS:")
print("{} nota(s) de R$ 100.00".format(numeroNotas100))
print("{} nota(s) de R$ 50.00".format(numeroNotas50))
print("{} nota(s) de R$ 20.00".format(numeroNotas20))
print("{} nota(s) de R$ 10.00".format(numeroNotas10))
print("{} nota(s) de R$ 5.00".format(numeroNotas5))
print("{} nota(s) de R$ 2.00".format(numeroNotas2))
print("MOEDAS:")
print("{} moeda(s) de R$ 1.00".format(numeroMoedas100))
print("{} moeda(s) de R$ 0.50".format(numeroMoedas50))
print("{} moeda(s) de R$ 0.25".format(numeroMoedas25))
print("{} moeda(s) de R$ 0.10".format(numeroMoedas10))
print("{} moeda(s) de R$ 0.05".format(numeroMoedas5))
print("{} moeda(s) de R$ 0.01".format(numeroMoedas1))
"""