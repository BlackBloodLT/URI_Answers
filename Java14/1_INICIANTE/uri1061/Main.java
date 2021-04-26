/**
 * Versão expandida e didática
 */

/**
 * Tempo de um Evento
 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
 * Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.
 * Entrada
 * Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.
 * Saída
 * Na saída, deve ser apresentada a duração do evento, no seguinte formato:
 * W dia(s)
 * X hora(s)
 * Y minuto(s)
 * Z segundo(s)
 */
package uri1061;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

        Scanner scanner = new Scanner(System.in);

        String[] diaI = scanner.nextLine().split(" ");
        String[] horarioI = scanner.nextLine().replaceAll(" ","").split(":");
        int diaInicial = Integer.parseInt(diaI[1]);
        int horaInicial = Integer.parseInt(horarioI[0]);
        int minutoInicial = Integer.parseInt(horarioI[1]);
        int segundoInicial = Integer.parseInt(horarioI[2]);

        String[] diaF = scanner.nextLine().split(" ");
        String[] horarioF = scanner.nextLine().replaceAll(" ","").split(":");
        int diaFinal = Integer.parseInt(diaF[1]);
        int horaFinal = Integer.parseInt(horarioF[0]);
        int minutoFinal = Integer.parseInt(horarioF[1]);
        int segundoFinal = Integer.parseInt(horarioF[2]);

        int diferencaDias = 0;
        int diferencaHoras = 0;
        int diferencaMinutos = 0;
        int diferencaSegundos = 0;

        if(diaFinal>diaInicial) {
            if(horaFinal>horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                }
            } else if(horaFinal==horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial-1+24;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                }
            } else if(horaFinal<horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24;
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial-1+60;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial+24-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                }
            }
        } else if(diaFinal==diaInicial) {
            if(horaFinal>horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                }
            } else if(horaFinal==horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal==segundoInicial) {
                        diferencaDias = diaFinal-diaInicial;
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal==segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal<segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    }
                }
            } else if(horaFinal<horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal==segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal<segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal==segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal<segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal==segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    } else if(segundoFinal<segundoInicial) {
                        // Essa situação não é possível para o caso!!!
                    }
                }
            }
        } else if(diaFinal<diaInicial) {
            // Essa situação não é possível para o caso!!!
        }

        System.out.println(diferencaDias + " dia(s)");
        System.out.println(diferencaHoras + " hora(s)");
        System.out.println(diferencaMinutos + " minuto(s)");
        System.out.println(diferencaSegundos + " segundo(s)");

    }
}