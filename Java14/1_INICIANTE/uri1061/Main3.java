/**
 * Versão final
 */

package uri1061;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {

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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
                        diferencaDias = diaFinal-diaInicial-1;
                        diferencaHoras = horaFinal-horaInicial-1+24;
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
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
                    if(segundoFinal>=segundoInicial) {
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>=segundoInicial) {
                        diferencaHoras = horaFinal-horaInicial;
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal<minutoInicial) {
                    if(segundoFinal>=segundoInicial) {
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaHoras = horaFinal-horaInicial-1;
                        diferencaMinutos = minutoFinal-minutoInicial+60-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                }
            } else if(horaFinal==horaInicial) {
                if(minutoFinal>minutoInicial) {
                    if(segundoFinal>=segundoInicial) {
                        diferencaMinutos = minutoFinal-minutoInicial;
                        diferencaSegundos = segundoFinal-segundoInicial;
                    } else if(segundoFinal<segundoInicial) {
                        diferencaMinutos = minutoFinal-minutoInicial-1;
                        diferencaSegundos = segundoFinal-segundoInicial+60;
                    }
                } else if(minutoFinal==minutoInicial) {
                    if(segundoFinal>segundoInicial) {
                        diferencaSegundos = segundoFinal-segundoInicial;
                    }
                }
            }
        }

        System.out.println(diferencaDias + " dia(s)");
        System.out.println(diferencaHoras + " hora(s)");
        System.out.println(diferencaMinutos + " minuto(s)");
        System.out.println(diferencaSegundos + " segundo(s)");
    }
}