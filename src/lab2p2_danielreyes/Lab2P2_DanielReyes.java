
package lab2p2_danielreyes;

import java.util.ArrayList;
import java.util.Scanner;


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
        
            switch (resp){
                case 1: {
                    
                int resp2;
                do {
                    System.out.println("1- Sign up");
                    System.out.println("2- Log in");
                    System.out.println("3- Log out");
                    System.out.println("4- Volver");
                    System.out.println("Ingrese una opción: ");
                    resp2 = leer.nextInt();

                    String name;
                    int edad;
                    String user;
                    String password;
                    switch (resp2) {
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

            }// opcion 3
            }
            

        } while (resp != 4);
    }//main

}
