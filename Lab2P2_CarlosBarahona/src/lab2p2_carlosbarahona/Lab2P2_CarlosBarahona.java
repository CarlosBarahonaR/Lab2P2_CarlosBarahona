/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carlosbarahona;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab2P2_CarlosBarahona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        ArrayList Computadoras = new ArrayList();
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("1) Agregar una computadora\n"
                    + "2) Modificar una computadora\n"
                    + "3) Eliminar una computadora\n"
                    + "4) Listar computadoras"
                    + "5) Informe de computadoras gamers\n"
                    + "6) Informe de computadoras educativas\n"
                    + "7) Informe de computadoras de poco uso\n"
                    + "8) Salir");
            opcion = lectura.nextInt();
            switch (opcion) {

                case 1: {
                    System.out.println("Modelo");
                    String modelo = lectura.next();
                    System.out.println("Número de serie");
                    String numSerie = lectura.next();
                    System.out.println("Capacidad de disco duro");
                    int capDiscDuro = lectura.nextInt();
                    System.out.println("Tamaño de pantalla");
                    int tamPantalla = lectura.nextInt();
                    System.out.println("Sistema operativo por defecto (Windows/ChromeOS)");
                    String OSporDefecto = lectura.next();
                    if ("Windows".equals(OSporDefecto) || "windows".equals(OSporDefecto)) {
                        OSporDefecto = "Windows";
                    } else if ("ChromeOS".equals(OSporDefecto) || "chromeos".equals(OSporDefecto)) {
                        OSporDefecto = "ChromeOS";

                    } else {
                        OSporDefecto = "Otro";
                    };
                    System.out.println("Tiempo que tardo en fabricarse");
                    int tiempoFabr = lectura.nextInt();
                    System.out.println("Capacidad de batería(en miliamperios)");
                    int capBat = lectura.nextInt();
                    System.out.println("Duración de batería (en horas)");
                    int duracionBat = lectura.nextInt();
                    System.out.println("Tarjeta gráfica (Normal/Gamer)");
                    String tarjeta = lectura.next();
                    if ("Gamer".equals(tarjeta) || "gamer".equals(tarjeta)) {
                        tarjeta = "Gamer";
                    } else if ("Normal".equals(tarjeta) || "normal".equals(tarjeta)) {
                        tarjeta = "Normal";
                    } else {
                        tarjeta = "Normal";
                    };
                    System.out.println("Tipo de procesador");
                    String tipoProc = lectura.next();
                    System.out.println("Teclado numérico (Si o No) (Escribir en mayuscula la letra inicial de la respuesta)");
                    String teclado = lectura.next();
                    boolean resp = false;
                    if (teclado == "Si") {
                        resp = true;
                    } else {
                        resp = false;
                    }
                    boolean tecladoNum = resp;

                    Computadoras.add(new Computadora(modelo, numSerie, capDiscDuro, tamPantalla, tecladoNum, tipoProc, tarjeta, OSporDefecto, tiempoFabr, capBat, duracionBat));

                    break;
                }
                case 2: {

                    System.out.println("Escriba el numero de serie al cual desea hacerle cambios");
                    String serie = lectura.next();
                    int item = 0;
                    for (int i = 0; i < Computadoras.size(); i++) {
                        String NumSerie = ((Computadora) Computadoras.get(i)).getNumSerie();
                        if (serie.equals(NumSerie)) {
                            item = i;
                            i = Computadoras.size();
                        } else {
                            item = 1000;
                        }
                    }
                    if (item <= Computadoras.size()) {
                        if (Computadoras.get(item) instanceof Computadora) {
                            System.out.println("Seleccione que desea modificar de la computadora\n"
                                    + "1) Modelo\n"
                                    + "2) Capacidad de disco duro\n"
                                    + "3) Tamaño de pantalla\n"
                                    + "4) Teclado numérico\n"
                                    + "5) Tipo de procesador\n"
                                    + "6) Tarjeta gráfica\n"
                                    + "7) Sistema operativo por defecto\n"
                                    + "8) Tiempo que tardo en fabricarse\n"
                                    + "9) Capacidad de bateria\n"
                                    + "10) Duración de batería");
                            int variable = lectura.nextInt();

                            switch (variable) {
                                case 1:
                                    System.out.println("Cambio de modelo");
                                    ((Computadora) Computadoras.get(item)).setModelo(lectura.next());
                                    break;
                                case 2:
                                    System.out.println("Cambio de capacidad de disco duro");
                                    ((Computadora) Computadoras.get(item)).setCapDiscD(lectura.nextInt());
                                    break;
                                case 3:
                                    System.out.println("Cambio de tamaño de pantalla");
                                    ((Computadora) Computadoras.get(item)).setTamañoPant(lectura.nextInt());
                                    break;
                                case 4:
                                    System.out.println("Cambio de si tiene teclado númerico o no");
                                    ((Computadora) Computadoras.get(item)).setTecladoNum(lectura.hasNext("Si"));
                                    break;
                                case 5:
                                    System.out.println("Cambio de tipo de procesador");
                                    ((Computadora) Computadoras.get(item)).setTipoProc(lectura.next());
                                    break;
                                case 6:
                                    System.out.println("Cambio de tajeta gráfica (Gamer/Normal)");
                                    ((Computadora) Computadoras.get(item)).setTajetaGraf(lectura.next());
                                    break;
                                case 7:
                                    System.out.println("Cambio de sistema operativo por defecto (Windows/ChromeOS)");
                                    ((Computadora) Computadoras.get(item)).setOSporDefecto(lectura.next());
                                    break;
                                case 8:
                                    System.out.println("Cambio de tiempo que tardo en fabricarse");
                                    ((Computadora) Computadoras.get(item)).setTiempoFab(lectura.nextInt());
                                    break;
                                case 9:
                                    System.out.println("Cambio de capacidad de bateria");
                                    ((Computadora) Computadoras.get(item)).setCapacidadBat(lectura.nextInt());
                                    break;
                                case 10:
                                    System.out.println("Cambio de duración de batería");
                                    ((Computadora) Computadoras.get(item)).setDuracionBat(lectura.nextInt());
                                    break;
                            }
                        }
                    } else {
                        System.out.println("No se encuentra el numero de serie :/");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Escriba el numero de serie al cual desea hacerle cambios");
                    String serie = lectura.next();
                    int item = 0;
                    for (int i = 0; i < Computadoras.size(); i++) {
                        String Num = ((Computadora) Computadoras.get(i)).getNumSerie();
                        if (serie.equals(Num)) {
                            item = i;
                            i = Computadoras.size();
                        } else {
                            item = 1000;
                        }
                    }
                    if (item <= Computadoras.size()) {
                        Computadoras.remove(item);
                    } else {
                        System.out.println("No se encuentra el numero de serie :/");
                    }

                }
                break;
                case 4: {
                    for (int i = 0; i < Computadoras.size(); i++) {
                        System.out.println(Computadoras.get(i));
                    }
                    break;
                }
                case 5: {
                    System.out.println("Computadoras Gamers");
                    for (int i = 0; i < Computadoras.size(); i++) {
                        if (((Computadora) Computadoras.get(i)).getTajetaGraf().equals("Gamer") && ((Computadora) Computadoras.get(i)).getTamañoPant() > 17 && ((Computadora) Computadoras.get(i)).isTecladoNum() == true) {
                            System.out.println(Computadoras.get(i));
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Computadoras Educativas");
                    for (int i = 0; i < Computadoras.size(); i++) {
                        if (((Computadora) Computadoras.get(i)).getCapDiscD() < 300 && ((Computadora) Computadoras.get(i)).getOSporDefecto().equals("ChromeOS") && ((Computadora) Computadoras.get(i)).getTamañoPant() < 13) {
                            System.out.println(Computadoras.get(i));
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Computadoras de poco uso ");
                    for (int i = 0; i < Computadoras.size(); i++) {
                        if (((Computadora) Computadoras.get(i)).getTiempoFab() < 2 && ((Computadora) Computadoras.get(i)).getDuracionBat() > 1 && ((Computadora) Computadoras.get(i)).getOSporDefecto().equals("Windows")) {
                            System.out.println(Computadoras.get(i));
                        }
                    }
                    break;

                }

            }

        }
    }

}
