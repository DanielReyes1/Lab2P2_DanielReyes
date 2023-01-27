
package lab2p2_danielreyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;


public class Lab2P2_DanielReyes {
 
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        int resp;
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
                            case 1:{
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
                                            String salida="";
                                            for (Object c : lista) {
                                                if(c instanceof Casas){
                                                    salida += "" + lista.indexOf(c)+ "- "+ c+ "\n";
                                                    System.out.println(salida);
                                                    salida= "";
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("------LISTA-------");
                                            String salid="";
                                            for (Object c : lista) {
                                                if(c instanceof Casas){
                                                    salid += "" + lista.indexOf(c)+ "- "+ c+ "\n";
                                                    System.out.println(salid);
                                                    salid="";
                                                }
                                            }
                                            System.out.println("Posicion a modificar: ");
                                            int pos = leer.nextInt();
                                            lista.remove(pos);
                                            lista.add(pos, crearC());
                                            break;
                                    }

                                } while (resp2 != 6);
                            }break;
                            case 2:{
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
                                            String salida="";
                                            for (Object e : lista) {
                                                if(e instanceof Edificios){
                                                    salida += "" + lista.indexOf(e)+ "- "+ e+ "\n";
                                                    System.out.println(salida);
                                                    salida = "";
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("------LISTA-------");
                                            String salid="";
                                            for (Object e : lista) {
                                                if(e instanceof Edificios){
                                                    salid += "" + lista.indexOf(e)+ "- "+ e+ "\n";
                                                    System.out.println(salid);
                                                    salid="";
                                                }
                                            }
                                            System.out.println("Posicion a modificar: ");
                                            int pos = leer.nextInt();
                                            if(pos < lista.size() && pos>= 0 ){
                                            lista.remove(pos);
                                            lista.add(pos, crearE());
                                            break;
                                            }
                                    }

                                            

                                } while (resp2 != 6);
                            }break;
                            case 3:{
                                
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
                                            String salida="";
                                            for (Object s : lista) {
                                                if(s instanceof Solares){
                                                    salida += "" + lista.indexOf(s)+ "- "+ s+ "\n";
                                                    System.out.println(salida);
                                                    salida = "";
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("------LISTA-------");
                                            String salid="";
                                            for (Object s : lista) {
                                                if(s instanceof Solares){
                                                    salid += "" + lista.indexOf(s)+"- "+ s+ "\n";
                                                    System.out.println(salid);
                                                    salid="";
                                                }
                                            }
                                            System.out.println("Posicion a modificar: ");
                                            int pos = leer.nextInt();
                                            lista.remove(pos);
                                            lista.add(pos, crearS());
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
                    int resp3;
                    do {
                        System.out.println("1- Sign up");
                        System.out.println("2- Log in");
                        System.out.println("3- Log out");
                        System.out.println("4- Volver");
                        System.out.println("Ingrese una opción: ");
                        resp3 = leer.nextInt();

                        String name;
                        int edad;
                        String user;
                        String password;
                        switch (resp3) {
                            case 1:
                                ArrayList lista = new ArrayList();
                                System.out.println("Ingrese su nombre: ");
                                name = leer.next();
                                lista.add(name);
                                System.out.println("Ingrese su edad: ");
                                edad = leer.nextInt();
                                lista.add(edad);
                                System.out.println("Ingrese su username: ");
                                user = leer.next();
                                lista.add(user);
                                System.out.println("Ingrese su contraseña");
                                password = leer.next();
                                lista.add(password);

                                //Usuario u = new Usuario(name, edad, user, password);
                                break;
                            case 2:
                                System.out.println("Ingrese el usuario: ");
                                String usuario = leer.next();
                                System.out.println("Ingrese la contraseña: ");
                                String contra = leer.next();

                                break;

                            case 3:
                                break;

                        }
                    } while (resp != 4);

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
}
