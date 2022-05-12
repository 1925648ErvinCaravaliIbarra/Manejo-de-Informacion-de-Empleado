/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peraciones;

/**
 *
 * @author ervin
 */
import java.util.ArrayList;
import java.util.HashSet;


public class Operaciones {
private  ArrayList <String> arrayList;


 
 public Operaciones () {
 
     arrayList= new ArrayList <>();
     
 }
 
 
 /*metdo ingresar datos va a resivir un valor*/
  
 public String IngresarDato(String valor, String tipoColeccion) {
   String mensajeSalida= "";
   
    
   switch(tipoColeccion)
   {   
       case "Operario" : 
           arrayList.add(valor);
           mensajeSalida= "almacenado con éxito";
           break;
           
       case "Conductor" : 
           arrayList.add(valor);
           mensajeSalida= "almacenado con éxito";
           break;
       case "Administrativo" : 
           arrayList.add(valor);
           mensajeSalida= "almacenado con éxito";
           break;
        
           
       default : mensajeSalida= "error";
         
   }
   return mensajeSalida;
 }
 
 public String MostrarDato(String tipo){
  String datoMostrar = "";
  switch(tipo)
   {   
       case "Operario" :
           datoMostrar= "Los datos del empleado son :\n";
            for (int i=0;i< arrayList.size(); i++ )
        {
          datoMostrar+= arrayList.get(i)+"\n";
        }
        break;
         
         case "Conductor" :
           datoMostrar= "Los datos del empleado son:\n";
            for (int i=0;i< arrayList.size(); i++ )
        {
          datoMostrar+= arrayList.get(i)+"\n";
        }
        break;
        
        case "Administrativo" :
           datoMostrar= "Los datos del empleado son:\n";
            for (int i=0;i< arrayList.size(); i++ )
        {
          datoMostrar+= arrayList.get(i)+"\n";
        }
        break;
        default : datoMostrar= "no se pudo mostrar el elemento porque no se selecciono una extructura inexistente";
   }
  
  return datoMostrar;  
 }

 }
 


