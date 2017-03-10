
package ejercicio.cuenta.banco;

import java.util.Scanner;

public class menu {
 Scanner tec = new Scanner(System.in);
    inf_operaciones c;
//    estudiante e[] = new estudiante[2];

    public menu() {
        c = new inf_operaciones();
    }
    
    

    public void menu() {
        int op=0;
       while (op != 5) {
            System.out.println("1. crear cuenta");
            System.out.println("2.consultar saldo");
            System.out.println("3. retirar saldo");
            System.out.println("4. consignar a cuenta");
            System.out.println("5. salir");
            op = tec.nextInt();

            switch (op) {
                
                case 1:
                    
                   if(c != null){
                       String nombre;
                       int cuenta,contraseña,consignacion;
                       System.out.println("dijite el nombre");
                       nombre = tec.nextLine();
                       tec.nextLine();
                       System.out.println("dijite numero de cuenta ");
                       cuenta = tec.nextInt();
                       System.out.println(" dijite contraseña ");
                       contraseña = tec.nextInt();
                       System.out.println("su cuenta se ha creado con exito");
                       } else {
                        System.out.println("primero ingrese los datos");
                    }
                    break;

                case 2:
                    System.out.println("su saldo es:"+c.consultar_saldo());
                    break;

                case 3:
                    System.out.println("el saldo a retirar es:");
                    c.retirar = tec.nextInt();
                    System.out.println( c.retirar());
                    break;
                   
                case 4:
                  
                    System.out.println("el saldo a consignar es:");
                    c.consignacion =tec.nextInt();
                    System.out.println("su saldo nuevo es:"+ c.consigansiones());
                    
                    break;
                    
                case 5:
                    System.out.println("ud ha salido con exito");
                    
                    break;
            }
           
        }
    }    
}
