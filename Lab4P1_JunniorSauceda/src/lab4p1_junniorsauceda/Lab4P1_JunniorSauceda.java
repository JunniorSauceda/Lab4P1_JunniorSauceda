/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_junniorsauceda;
import java.util.Scanner;
/**
 *
 * @author Junnior Sauceda
 */
public class Lab4P1_JunniorSauceda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        boolean seguir=true;
        while(seguir){
            System.out.println("Menu");
            System.out.println("1.-Conjuntos");
            System.out.println("2.-Contraseña mejorada");
            System.out.println("3.-Salir");
            int opcion=in.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese la primer cadena");
                    String A=sc.nextLine();
                    boolean cadena1=false;
                    int w=3;
                    int r=4;
                    while(cadena1==false){
                        for(int i=0;i<A.length();i++){
                            char p=A.charAt(i);
                            int ñ=p;
                            if(i==0){
                                if(ñ!=65){
                                    break;
                                }
                            }
                            else if(i==1){
                                if(ñ!=61){
                                    break;
                                }
                            }
                            else if(i==2){
                                if(ñ!=123){
                                    break;
                                }
                            }
                            else if(i==w){
                                if(ñ<97||ñ>122){
                                    break;
                                }
                            }
                            else if(i==r){
                                if(ñ!=44){
                                    break;
                                }
                            }
                            else if(i==A.length()){
                                if(ñ!=125){
                                    break;
                                }
                            }
                            else{
                                cadena1=true;
                                break;
                            }
                        }
                        if(cadena1==false){
                            System.out.println("La cadena no esta redactada correctamente. Por favor ingrese una cadena bien estructurada");
                            A=sc.nextLine();
                        }
                    }
                    System.out.println("Ingrese la segunda cadena");
                    in.nextLine();
                    String B=in.nextLine();
                    cadena1=false;
                     w=3;
                    r=4;
                    while(cadena1==false){
                        for(int i=0;i<A.length();i++){
                            char p=A.charAt(i);
                            int ñ=p;
                            if(i==0){
                                if(ñ!=66){
                                    break;
                                }
                            }
                            else if(i==1){
                                if(ñ!=61){
                                    break;
                                }
                            }
                            else if(i==2){
                                if(ñ!=123){
                                    break;
                                }
                            }
                            else if(i==w){
                                if(ñ<97||ñ>122){
                                    break;
                                }
                            }
                            else if(i==r){
                                if(ñ!=44){
                                    break;
                                }
                            }
                            else if(i==A.length()){
                                if(ñ!=125){
                                    break;
                                }
                            }
                            else{
                                cadena1=true;
                                break;
                            }
                        }
                        if(cadena1==false){
                            System.out.println("La cadena no esta redactada correctamente. Por favor ingrese una cadena bien estructurada");
                            B=sc.nextLine();
                        }
                    }
                    String acum1="";
                    String acum2="";
                    String union1="";
                    String union2="";
                    for(int y=3;y<A.length()-1;y+=2){
                        char a=A.charAt(y);
                        union1+=a;
                        for(int z=3;z<B.length()-1;z+=2){
                            char b=B.charAt(z);
                            union2+=b;
                            if(a==b){
                                acum1+=a;
                            }
                        }
                    }
                    int contador=1;
                    for(int g=0;g<union2.length();g++){
                        char t=union2.charAt(g);
                        for(int h=0;h<union1.length();h++){
                            char k=union1.charAt(h);
                            if(t==k){
                                contador++;
                            }
                        }
                    }
                    if(contador==union2.length()){
                        System.out.println("Ambos conjuntos son iguales");
                    }
                    else{
                        System.out.println("Union: C={"+union1+union2+"}");
                        System.out.println("Interseccion: D={"+acum1+"}");
                    }
                }
                break;
                case 2:{
                    System.out.println("Ingrese la contraseña:");
                    String contraseña=sc.next();
                    System.out.println("Ingrese un numero:");
                    int numero=in.nextInt();
                    boolean caracteres=false;
                    boolean num=false;
                    boolean letra=false;
                    boolean segura=false;
                    int n=0,l=0;
                        while(segura==false){
                            for(int x=0;x<contraseña.length();x++){
                                char c1=contraseña.charAt(x);
                                int ascii=c1;
                                if((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122)){
                                    l++;
                                }
                                else if(ascii>=48&&ascii<=57){
                                    n++;
                                }
                            }
                            if(l>=1){
                                letra=true;
                            }
                            if(n>=1){
                                num=true;
                            }
                            if(contraseña.length()>=8){
                                caracteres=true;
                            }
                            if(letra&&num&&caracteres){
                                segura=true;
                                System.out.println("La contraseña es segura");
                                break;
                            }
                            if(caracteres==false){
                                System.out.println("La contraseña no es segura porque tiene menos de 8 caracteres ");
                            }
                            if(num==false){
                                System.out.println("La contraseña no es segura porque no tiene numeros");
                            }
                            if(letra==false){
                                System.out.println("La contraseña no es segura porque no tiene letras");
                            }
                            System.out.println("Ingrese la contraseña:");
                            contraseña=sc.next();
                            System.out.println("Ingrese un numero:");
                            numero=in.nextInt();
                        }
                        String nvacontra="";
                        int p=1;
                        for(int j=0;j<contraseña.length();j++){
                            char q=contraseña.charAt(j);
                            nvacontra+=q;
                            if(j==p){
                                p+=2;
                                nvacontra+=numero;
                                numero++;
                            }
                        }
                        System.out.println("La nueva contraseña es: "+nvacontra);
                }
                break;
                case 3:{
                    seguir=false;
                }
                break;
                default:{
                    System.out.println("Opcion Invalida");
                }
                break;
            }
        }
        // TODO code application logic here
    }
    
}
