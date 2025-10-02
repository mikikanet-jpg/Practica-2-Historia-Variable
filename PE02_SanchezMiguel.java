package Practica2;
import java.util.Scanner;
public class PE02_SanchezMiguel {
    public static void main(String[] args) {
         Scanner k = new Scanner(System.in);
            boolean teCasc = false;
            
            System.out.println("Et despertes dins d'una estació espacial a la deriva.");
            System.out.println("Les llums d'emergència parpellegen i l'aire és pesat i dens.");
            System.out.println("Al teu costat hi ha un vell casc espacial cobert de pols");
            System.out.println("Que vols fer?");
            System.out.println("(1.) Agafar el casc");
            System.out.println("(2.) Deixar-lo i seguir endevant");
            int decisio0 = k.nextInt();

            if (decisio0==1)
            {
                teCasc =  true;
            }

            System.out.println("Avances pel passadis principal, il·luminat només per llums vermelles intermitents.");
            System.out.println("El silenci és trencat de tant en tant per algun grinyol metàl·lic de l'estructura.");
            System.out.println("A la teva esquerra hi ha el mòdul de comandament; a la dreta el laboratori cientfic.");
            System.out.println("A on vas?");
            System.out.println("(1.) Entrar al modul de comandament.");
            System.out.println("(2.) Explorar el laboratori cientific");
            int decisio1 = k.nextInt();

    }
}
