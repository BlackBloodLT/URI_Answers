#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Teste de Seleção 1
Leia 4 valores inteiros A, B, C e D. A seguir, se B for 
maior do que C e se D for maior do que A, e a soma de C 
com D for maior que a soma de A e B e se C e D, ambos, 
forem positivos e se a variável A for par escrever a 
mensagem "Valores aceitos", senão escrever "Valores nao 
aceitos".
Entrada
Quatro números inteiros A, B, C e D.
Saída
Mostre a respectiva mensagem após a validação dos valores.
"""

"""
Created on Fri May 14 20:11:44 2021

@author: lamarkscavalcanti
"""

entrada = input().split(" ")

valorA = int(entrada[0])
valorB = int(entrada[1])
valorC = int(entrada[2])
valorD = int(entrada[3])

operacao1 = False
operacao2 = False
operacao3 = False
operacao4 = False
operacao5 = False
operacao6 = False

if(valorB>valorC):
    operacao1 = True
    
if(valorD>valorA):
    operacao2 = True
    
if((valorC+valorD)>(valorA+valorB)):
    operacao3 = True
    
if(valorC>0):
    operacao4 = True    

if(valorD>0):
    operacao5 = True
    
if(valorA%2==0):
    operacao6 = True
    
if(operacao1 and operacao2 and operacao3 and operacao4 and operacao5 and operacao6):
    print("Valores aceitos")
else:
    print("Valores nao aceitos")