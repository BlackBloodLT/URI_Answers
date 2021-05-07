#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Área do Círculo
A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e 
multiplicando por π.
Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a 
variável raio.
Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme 
exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla 
precisão (double). Como todos os problemas, não esqueça de imprimir o fim de 
linha após o resultado, caso contrário, você receberá "Presentation Error".
"""
"""
Created on Thu May  6 21:49:16 2021

@author: lamarkscavalcanti
"""

raio = float(input())

areaCirculo = pow(raio,2)*3.14159

print("A=%0.4f" %areaCirculo)