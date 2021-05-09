"""
Conversão de Tempo
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o
expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo
fornecido.
"""

tempo = int(input())

hora = tempo//3600
tempo -= hora*3600

minuto = tempo//60
tempo -= minuto*60

segundo = tempo

print("{0}:{1}:{2}".format(hora,minuto,segundo))