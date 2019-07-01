/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musulmana;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Antonio
 */
public class Musulmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        int i=0;
        System.out.println("Ingresar un numero");
        Scanner num = new Scanner(System.in);
        long numero=0;
        do{
            try{
                numero = num.nextLong();
                i=1;
            }catch(Exception e){
                System.out.println("Ingrese un numero valido");
                num = new Scanner(System.in);
            } 
        }while(i==0);
        if(numero<0){
            numero=-numero;
        }
        double division = numero;
        int a= (int) division;
        ArrayList<Integer> f= new ArrayList<Integer>();
        do{ 
            division=division/16;
            a=(int)division;
            double resta= (division-a)*16;
            resta=(int)resta;
            f.add((int)resta);
            System.out.println(a);
        }while(a!=0);
        String [] numeroFinal = new String[f.size()];
        int d=f.size()-1;
        for(int b=0;b<f.size();b++){
            if(f.get(d)>=10){
                if(f.get(d)==10){
                    numeroFinal[b]="A";
                }
                if(f.get(d)==11){
                    numeroFinal[b]="B";
                }
                if(f.get(d)==12){
                    numeroFinal[b]="C";
                }
                if(f.get(d)==13){
                    numeroFinal[b]="D";
                }
                if(f.get(d)==14){
                    numeroFinal[b]="E";
                }
                if(f.get(d)==15){
                    numeroFinal[b]="F";
                }
            } else{
                numeroFinal[b]=String.valueOf(f.get(d));
            }
            d--;
        }
        for(int b=0;b<f.size();b++){
            System.out.print(numeroFinal[b]+" ");
        }
    }  
}
