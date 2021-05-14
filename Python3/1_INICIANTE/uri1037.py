#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Intervalo
Você deve fazer um programa que leia um valor qualquer 
e apresente uma mensagem dizendo em qual dos seguintes 
intervalos ([0,25], (25,50], (50,75], (75,100]) este 
valor se encontra. Obviamente se o valor não estiver 
em nenhum destes intervalos, deverá ser impressa a 
mensagem “Fora de intervalo”.
O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive 
eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 
 até o valor 50.0000000                                                                                                                           
Entrada
O arquivo de entrada contém um número com ponto 
flutuante qualquer.
Saída
A saída deve ser uma mensagem conforme exemplo 
abaixo.
"""

"""
Created on Fri May 14 20:12:25 2021

@author: lamarkscavalcanti
"""

valor = float(input())
if 0<=valor<=25:
    print('Intervalo [0,25]')
if 25<valor<=50:
    print('Intervalo (25,50]')
if 50<valor<= 75:
    print('Intervalo (50,75]')
if 75<valor<=100:
    print('Intervalo (75,100]')
if valor>100 or valor<0:
    print('Fora de intervalo')