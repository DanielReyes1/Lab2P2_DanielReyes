
package lab2p2_danielreyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;


public class Lab2P2_DanielReyes {
 
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        int resp;
        String user = "";
        String pass = "";
        do {
            System.out.println("-------Menu-------");
            System.out.println("1- Registro de Inmueble/Solar");
            System.out.println("2- Manejo de Estados");
            System.out.println("3- Log In/ Sign Up / Log out");
            System.out.println("4- Salir del sistema");
            System.out.println("Ingrese una opción: ");
            resp = leer.nextInt();

            switch (resp) {

                case 1: {
                    ArrayList lista = new ArrayList();
                    int op;
                    do {
                        System.out.println("------Seleccion una opción------");
                        System.out.println("1- Casas");
                        System.out.println("2- Edificios");
                        System.out.println("3- Solares");
                        System.out.println("4- Volver");
                        op = leer.nextInt();

                        switch (op) {
                            case 1: {
                                int resp2;

                                do {
                                    System.out.println("-----Menu de Casas------");
                                    System.out.println("1- Crear");
                                    System.out.println("2- Listar");
                                    System.out.println("3- Modificar");
                                    System.out.println("4- Borrar");
                                    System.out.println("5- Comprar");
                                    System.out.println("6- Volver");
                                    System.out.println("Ingrese una opción: ");
                                    resp2 = leer.nextInt();

                                    switch (resp2) {
                                        case 1:
                                            lista.add(crearC());
                                            break;
                                        case 2:
                                            System.out.println("----LISTA-------");
                                            String salida = "";
                                            for (Object c : lista) {
                                                if (c instanceof Casas) {
                                                    salida += "" + lista.indexOf(c) + "- " + c + "\n";
                                                    System.out.println(salida);
                                                    salida = "";
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("------OPCIONES-------");
                                            String salid = "";
                                            for (Object c : lista) {
                                                if (c instanceof Casas) {
                                                    salid += "" + lista.indexOf(c) + "- " + c + "\n";
                                                    System.out.println(salid);
                                                    salid = "";
                                                }
                                            }
                                            System.out.println("Posicion a modificar: ");
                                            int pos = leer.nextInt();
                                            if (pos < lista.size() && pos >= 0) {
                                                lista.remove(pos);
                                                lista.add(pos, crearC());
                                                break;
                                            }
                                        case 4:
                                            System.out.println("------OPCIONES-------");
                                            String sali = "";
                                            for (Object c : lista) {
                                                if (c instanceof Casas) {
                                                    sali += "" + lista.indexOf(c) + "- " + c + "\n";
                                                    System.out.println(sali);
                                                    sali = "";
                                                }
                                            }
                                            System.out.println("Posicion a eliminar: ");
                                            int posi = leer.nextInt();
                                            if (posi < lista.size() && posi >= 0) {
                                                lista.remove(posi);

                                            }
                                            break;
                                        case 5:
                                            System.out.println("------OPCIONES-------");
                                            String sal = "";
                                            for (Object c : lista) {
                                                if (c instanceof Casas) {
                                                    sal += "" + lista.indexOf(c) + "- " + c + "\n";
                                                    System.out.println(sal);
                                                    sal = "";
                                                }
                                            }
                                            System.out.println("Cual casa desea comprar: ");
                                            int posic = leer.nextInt();
                                            if (posic < lista.size() && posic >= 0) {
                                                
                                            }
                                            break;
                                    }

                                } while (resp2 != 6);
                            }
                            break;
                            case 2: {
                                int resp2;

                                do {
                                    System.out.println("-----Menu de Edificios------");
                                    System.out.println("1- Crear");
                                    System.out.println("2- Listar");
                                    System.out.println("3- Modificar");
                                    System.out.println("4- Borrar");
                                    System.out.println("5- Comprar");
                                    System.out.println("6- Volver");
                                    System.out.println("Ingrese una opción: ");
                                    resp2 = leer.nextInt();

                                    switch (resp2) {
                                        case 1:
                                            lista.add(crearE());
                                            break;
                                        case 2:
                                            System.out.println("----LISTA-------");
                                            String salida = "";
                                            for (Object e : lista) {
                                                if (e instanceof Edificios) {
                                                    salida += "" + lista.indexOf(e) + "- " + e + "\n";
                                                    System.out.println(salida);
                                                    salida = "";
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("------OPCIONES-------");
                                            String salid = "";
                                            for (Object e : lista) {
                                                if (e instanceof Edificios) {
                                                    salid += "" + lista.indexOf(e) + "- " + e + "\n";
                                                    System.out.println(salid);
                                                    salid = "";
                                                }
                                            }
                                            System.out.println("Posicion a modificar: ");
                                            int pos = leer.nextInt();
                                            if (pos < lista.size() && pos >= 0) {
                                                lista.remove(pos);
                                                lista.add(pos, crearE());
                                                break;
                                            }
                                        case 4:
                                            System.out.println("------OPCIONES-------");
                                            String sali = "";
                                            for (Object e : lista) {
                                                if (e instanceof Edificios) {
                                                    sali += "" + lista.indexOf(e) + "- " + e + "\n";
                                                    System.out.println(sali);
                                                    sali = "";
                                                }
                                            }
                                            System.out.println("Posicion a eliminar: ");
                                            int posi = leer.nextInt();
                                            if (posi < lista.size() && posi >= 0) {
                                                lista.remove(posi);

                                            }
                                            break;
                                    }

                                } while (resp2 != 6);
                            }
                            break;
                            case 3: {

                                int resp2;

                                do {
                                    System.out.println("-----Menu de Solares------");
                                    System.out.println("1- Crear");
                                    System.out.println("2- Listar");
                                    System.out.println("3- Modificar");
                                    System.out.println("4- Borrar");
                                    System.out.println("5- Comprar");
                                    System.out.println("6- Volver");
                                    System.out.println("Ingrese una opción: ");
                                    resp2 = leer.nextInt();

                                    switch (resp2) {
                                        case 1:
                                            lista.add(crearS());
                                            break;
                                        case 2:
                                            System.out.println("----LISTA-------");
                                            String salida = "";
                                            for (Object s : lista) {
                                                if (s instanceof Solares) {
                                                    salida += "" + lista.indexOf(s) + "- " + s + "\n";
                                                    System.out.println(salida);
                                                    salida = "";
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("------OPCIONES-------");
                                            String salid = "";
                                            for (Object s : lista) {
                                                if (s instanceof Solares) {
                                                    salid += "" + lista.indexOf(s) + "- " + s + "\n";
                                                    System.out.println(salid);
                                                    salid = "";
                                                }
                                            }
                                            System.out.println("Posicion a modificar: ");
                                            int pos = leer.nextInt();
                                            if (pos < lista.size() && pos >= 0) {
                                                lista.remove(pos);
                                                lista.add(pos, crearS());
                                                break;
                                            }
                                        case 4:
                                            System.out.println("------OPCIONES-------");
                                            String sali = "";
                                            for (Object s : lista) {
                                                if (s instanceof Solares) {
                                                    sali += "" + lista.indexOf(s) + "- " + s + "\n";
                                                    System.out.println(sali);
                                                    sali = "";
                                                }
                                            }
                                            System.out.println("Posicion a eliminar: ");
                                            int posi = leer.nextInt();
                                            if (posi < lista.size() && posi >= 0) {
                                                lista.remove(posi);

                                            }
                                            break;

                                    }

                                } while (resp2 != 6);

                            }
                            break;
                        }
                    } while (op != 4);

                }// fin de opcion1
                break;
                case 2: {

                }// fin de opcion2
                break;
                case 3: {
                    ArrayList datos = new ArrayList();
                    int resp3;
                    do {
                        System.out.println("-----USUARIO----");
                        System.out.println("1- Sign up");
                        System.out.println("2- Log in");
                        System.out.println("3- Log out");
                        System.out.println("4- Volver");
                        System.out.println("Ingrese una opción: ");
                        resp3 = leer.nextInt();

                        
                        switch (resp3) {
                            case 1:
                                datos.add(crearU());
                                
                                break;
                            case 2:
                                  System.out.println("Ingrese el usuario: ");
                                String usuario = leer.next();
                                System.out.println("Ingrese la contraseña: ");
                                String contra = leer.next();
                                int cont = 0;
                                for (int i = 0; i < datos.size(); i++) {
                                    if(usuario.equals(datos.get(i))){
                                        cont++;
                                        for (int j = 0; j < datos.size(); j++) {
                                            if(contra == datos.get(j));
                                            cont++;
                                            user = usuario;
                                            pass = contra;
                                        }
                                    }
                                }
                                if(cont >= 1){
                                    System.out.println("Ha ingresado adecuadamente");
                                }
                                else{
                                    System.out.println("Lo siento, no ha ingresado a su cuenta");
                                }

                                break;

                            case 3:
                                System.out.println("Esta seguro que desea cerrar sesión: \n" + "1- Si\n" + "2- Cancelar");
                                int respuesta = leer.nextInt();
                                if(respuesta != 1){
                                    break;
                                }else{
                                    user = "";
                                    pass = "";
                                }
                                
                                break;
                            
                        }
                        
                    } while (resp3 != 4);

                }// fin opcion 3
                break;
            }// fin switch

        } while (resp != 4);
    }//main
    static Casas crearC(){
        System.out.println("Ingrese el numero de casa: ");
        int nc = leer.nextInt();
        System.out.println("Ingrese el numero del bloque de casa: ");
        int nb = leer.nextInt();
        System.out.println("Ingrese el color: ");
        Color c = JColorChooser.showDialog(null, "Seleccione un color", Color.BLACK);
        System.out.println("Ingrese el ancho: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el largo: ");
        int l = leer.nextInt();
        System.out.println("Ingrese numero de baños: ");
        int nb2 = leer.nextInt();
        System.out.println("Ingrese numero de cuartos: ");
        int nc2 = leer.nextInt();
        
        Casas nueva;
        return nueva = new Casas(nc, nb, c, a, l, nb2, nc2);
    }
    static Edificios crearE(){
        System.out.println("Ingrese numero de pisos: ");
        int p = leer.nextInt();
        System.out.println("Ingrese la cantidad de locales: ");
        int l = leer.nextInt();
        System.out.println("Ingrese la direccion por referencia: ");
        String d = leer.next();
        d = leer.nextLine();
        
        Edificios nueva;
        return nueva = new Edificios(p, l, d);
    }
    
    static Solares crearS(){
        System.out.println("Ingrese el ancho: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el largo: ");
        int l = leer.nextInt();
        
        int area = l * a;
        
        Solares nuevo;
        return nuevo = new Solares(a,l,area);
                
    }
    static Usuario crearU(){
        System.out.println("Ingrese su nombre: ");
        String n = leer.next();
        n = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        int e = leer.nextInt();
        System.out.println("Ingrese su usuario: ");
        String u = leer.next();
        u = leer.nextLine();
        System.out.println("Ingrese contraseña: ");
        String c = leer.next();
        c = leer.nextLine();
        
        Usuario nuevo;
        return nuevo = new Usuario(n, e, u, c);
        
    }
}
