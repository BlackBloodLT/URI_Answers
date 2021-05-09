"""
Idade em Dias
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere t odo ano com 365 dias e t odo mês com 30 dias. Nos casos de teste
nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com
objetivo de testar raciocínio matemático simples.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Imprima a saída conforme exemplo fornecido.
"""

tempo = int(input())

ano = tempo//365
tempo -= ano*365

mes = tempo//30
tempo -= mes*30

dia = tempo

print("{0} ano(s)".format(ano))
print("{0} mes(es)".format(mes))
print("{0} dia(s)".format(dia))