"""
Distância Entre Dois Pontos
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e
calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
Distancia =
Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a
segunda linha contém dois valores de ponto flutuante x2 y2.
Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
"""

def distancia(x1,x2,y1,y2):
    dist = (((x2-x1)**(2))+((y2-y1)**(2)))**(1/2)
    return dist

entradaPrimeira = input().split(" ")
entradaSegunda = input().split(" ")

#print(entradaPrimeira)
#print(entradaSegunda)

xPrimeira = float(entradaPrimeira[0])
xSegunda = float(entradaSegunda[0])
yPrimeira = float(entradaPrimeira[1])
ySegunda = float(entradaSegunda[1])

#print(xPrimeira)
#print(xSegunda)
#print(yPrimeira)
#print(ySegunda)

distanciaEntrePontos = distancia(xPrimeira,xSegunda,yPrimeira,ySegunda)

print("%0.4f" %distanciaEntrePontos)