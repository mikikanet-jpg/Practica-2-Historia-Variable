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

            if (decisio1 == 1) {
                System.out.println("El passsadís es bifurca en dues direccions.");
                System.out.println("A l'esquerra, una porta blindada mig oberta deixa escapaar un so metàl·lic ritmic.");
                System.out.println("A la dreta, un passadis llarg i fosc sembla perdre's en la foscor.");
                System.out.println("Quin camí agafes?");
                System.out.println("(1.) Porta blindada de l'esquerra.");
                System.out.println("(2.) Passadis de la dreta.");
                int decisio2 = k.nextInt();

                if (decisio2 == 1) {
                    System.out.println("A dins hi ha una sala amb una consola plena de llums vermelles.");
                    System.out.println("Sembla que controla el sistema d'oxigen de tota l'estaciò.");
                    System.out.println("El panell està en estat critic i cal decidir rapid.");
                    System.out.println("Que fas?");
                    System.out.println("(1.) Intentar reparar el sistema.");
                    System.out.println("(2.) Ignorar la consola.");
                    int decisio3 = k.nextInt();

                    if (decisio3 == 1 && teCasc) {
                        System.out.println(" (FINAL HEROIC): Aconsegueixes reparar el sistema i restaures l'oxigen");
                    } else if (decisio3 == 1 && (teCasc == false)) {
                        System.out.println("(FINAL HORRORÓS): Els gasos tòxics t'ofeguen.");
                    } else {
                        System.out.println("(FINAL NEUTRE): Veus que hi ha una nau que funciona, marxes amb el misteri sense resoldre.");
                    }

                } else {
                    System.out.println("El passadis és estret i el terra grinyola sota els teus peus.");
                    System.out.println("De sobte, darrere teu, un so de passades es fa cada vegada més intens.");
                    System.out.println("Que fas?");
                    System.out.println("(1.) Correr cap a l'escotilla");
                    System.out.println("(2.) Amagar-te entre les cantonades.");
                    int decisio3 = k.nextInt();

                     if (decisio3 == 1 && teCasc) {
                    System.out.println("(FINAL MISTERIÓS): Trobes una càpsula d'escapament i fuges amb el codi que tenia el casc.");
                    } else if (decisio3 == 1 && teCasc) {
                    System.out.println("(FINAL DESESPERANÇADOR): La càpsula no s'activa i l'alien et mata.");
                    } else {
                    System.out.println("(FINAL TRÀGIC): Sents els passos d'una “cosa misteriosa” aproparse. Una criatura alienígena et captura.");
                    }

                }
            
            } else {
                System.out.println("El laboratori es ple de tubs de criogenesi trencat i taules cobertes de pols.");
                System.out.println("Un lleu so prové d'un dels tubs encara actius.");
                System.out.println("Al costat hi ha un ordinador central que sembla funcionar amb energia d'emergència.");
                System.out.println("Que vols fer?");
                System.out.println("(1.) Obrir un tub.");
                System.out.println("Inspeccionar l'ordinador central.");
                int decisio2 = k.nextInt();

                if (decisio2 == 1 && teCasc) {
                    System.out.println("(FINAL ESPERANÇADOR): Despertes un científic que et guia cap a la sortida.");
                } else if ( decisio2 == 1 && teCasc == false) {
                    System.out.println("(FINAL ESPANTÓS): L'experiment alliberat et devora.");
                } else {
                    System.out.println("(FINAL FANTASIOS): Descobreixes que hi ha un portal a la següent sala i escapes, pero no saps a on...");
                }
            }
            k.close();
        }
}