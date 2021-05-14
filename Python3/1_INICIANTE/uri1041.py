#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Coordenadas de um Ponto
Leia 2 valores com uma casa decimal (x e y), que 
devem representar as coordenadas de um ponto em 
um plano. A seguir, determine qual o quadrante 
ao qual pertence o ponto, ou se está sobre um 
dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem 
“Origem”.
Se o ponto estiver sobre um dos eixos escreva 
“Eixo X” ou “Eixo Y”, conforme for a situação.
Entrada
A entrada contem as coordenadas de um ponto.
Saída
A saída deve apresentar o quadrante em que o 
ponto se encontra.
"""

"""
Created on Fri May 14 20:31:01 2021

@author: lamarkscavalcanti
"""

ponto = input().split()

x = float(ponto[0])
y = float(ponto[1])

if(x==0):
    if(y==0):
        print('Origem')
    if(y!=0):
        print('Eixo Y')
if(y==0):
    if(x!=0):
        print('Eixo X')
if(x>0):
    if(y>0):
        print('Q1')
    if(y<0):
        print('Q4')
if(x<0):
    if(y>0):
        print('Q2')
    if(y<0):
        print('Q3')