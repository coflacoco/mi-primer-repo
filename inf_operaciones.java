
package ejercicio.cuenta.banco;

import java.util.Scanner;

public class inf_operaciones {
     
    int numero_de_cuenta,saldo,contraseña,consignacion,retirar;
    String nombre_propietario;

    public inf_operaciones() {
    }

    public inf_operaciones(int numero_de_cuenta, int saldo,int consignacion,int retirar, String nombre_propietario) {
        this.numero_de_cuenta = numero_de_cuenta;
        this.saldo = saldo;
        this.nombre_propietario = nombre_propietario;
        this.consignacion= consignacion;
        this.retirar= retirar;
    }
    
  public int consultar_saldo(){
        return saldo;
    }
  
  public String retirar(){
      
      if(saldo>0){
          saldo= saldo - retirar;
          return ("transacion realizada");
      }else{
         return("saldo insuficiente");
      }
     
  }
    
  
    
    public int consigansiones(){
        
        
          if (saldo>=0){
            
            saldo=saldo+consignacion;
           
            
        }
          return saldo;
    }
}
