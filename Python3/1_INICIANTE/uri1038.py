#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Lanche
Com base na tabela abaixo, escreva um programa que 
leia o código de um item e a quantidade deste item. 
A seguir, calcule e mostre o valor da conta a pagar.
Entrada
O arquivo de entrada contém dois valores inteiros 
correspondentes ao código e à quantidade de um item 
conforme tabela acima.
Saída
O arquivo de saída deve conter a mensagem "Total: 
R$ " seguido pelo valor a ser pago, com 2 casas 
após o ponto decimal.
"""

"""
Created on Fri May 14 20:12:38 2021

@author: lamarkscavalcanti
"""

entrada = input().split(" ")

codigo = int(entrada[0])
quantidade = int(entrada[1])

if(codigo==1):
    print('Total: R$ {:.2f}'.format(4.00*quantidade))
if(codigo==2):
    print('Total: R$ {:.2f}'.format(4.50*quantidade))
if(codigo==3):
    print('Total: R$ {:.2f}'.format(5.00*quantidade))
if(codigo==4):
    print('Total: R$ {:.2f}'.format(2.00*quantidade))
if(codigo==5):
    print('Total: R$ {:.2f}'.format(1.50*quantidade))