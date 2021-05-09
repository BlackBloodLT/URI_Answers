#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Produto Simples
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois 
valores e atribua esta operação à variável PROD. A seguir mostre a variável 
PROD com mensagem correspondente.    
Entrada
O arquivo de entrada contém 2 valores inteiros.
Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um 
espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de 
linha após o produto, caso contrário seu programa apresentará a mensagem: 
    “Presentation Error”.
"""

"""
Created on Sat May  8 22:33:08 2021

@author: lamarkscavalcanti
"""

valorA = int(input())
valorB = int(input())

produto = valorA * valorB

#print("PROD = ", produto)
print("PROD = %d" %produto)