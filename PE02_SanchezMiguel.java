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

    }
}
