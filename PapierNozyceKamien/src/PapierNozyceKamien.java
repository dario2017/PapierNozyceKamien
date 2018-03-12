

import java.util.Random;
import java.util.Scanner;

public class PapierNozyceKamien {

	static String bronUsera;
	static int bronUseraInt = -1;
	static int bronKomputeraInt;
	static boolean graAktywna = true;
	
	
	public static void main(String[] args) {
		String[] historiaGry = new String[0];
		System.out.println("Gra Papier/No�yce/Kamie�");
		
		while (graAktywna) {
			podajNazweBroni();
			bronKomputeraInt = new Random().nextInt(3);
			System.out.println(bronKomputeraInt);
			
			int[] bronie = {0, 1, 2};
			String[] historiaTemp = new String[0];
			String P = "Papier";
			String N = "No�yce";
			String K = "Kamie�";
			
			if (bronUseraInt == 0 && bronKomputeraInt == 0) {
				System.out.println(P + " vs " + P + ". Mamy remis. Gramy jeszcze raz");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = P + " vs " + P;	
				}
			} else if (bronUseraInt == 1 && bronKomputeraInt == 1) {
				System.out.println(N + " vs " + N + ". Mamy remis. Gramy jeszcze raz");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = N + " vs " + N;	
				}
			} else if (bronUseraInt == 2 && bronKomputeraInt == 2) {
				System.out.println(K + " vs " + K + ". Mamy remis. Gramy jeszcze raz");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = K + " vs " + K;	
				}
			} else if (bronUseraInt == 0 && bronKomputeraInt == 2) {
				System.out.println(P + " vs " + K + ". Zwyci�zc� jest Gracz");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = P + " vs " + K;	
				}
				graAktywna = false;
			} else if (bronUseraInt == 1 && bronKomputeraInt == 0) {
				System.out.println(N + " vs " + P + ". Zwyci�zc� jest Gracz");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = N + " vs " + P;	
				}
				graAktywna = false;
			} else if (bronUseraInt == 2 && bronKomputeraInt == 1) {
				System.out.println(K + " vs " + N + ". Zwyci�zc� jest Gracz");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = K + " vs " + N;	
				}
				graAktywna = false;
			} else if (bronUseraInt == 0 && bronKomputeraInt == 1) {
				System.out.println(P + " vs " + N + ". Zwyci�zc� jest Komputer");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = P + " vs " + N;	
				}
				graAktywna = false;
			} else if (bronUseraInt == 1 && bronKomputeraInt == 2) {
				System.out.println(N + " vs " + K + ". Zwyci�zc� jest Komputer");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = N + " vs " + K;	
				}
				graAktywna = false;
			} else if (bronUseraInt == 2 && bronKomputeraInt == 0) {
				System.out.println(K + " vs " + P + ". Zwyci�zc� jest Komputer");
				historiaTemp = historiaGry;
				historiaGry = new String[historiaTemp.length + 1];
				for (int j=0; j<historiaGry.length; j++) {
					for (int i=0; i<historiaTemp.length; i++) {
						historiaGry[i] = historiaTemp[i];
					}
					historiaGry[historiaGry.length - 1] = K + " vs " + P;	
				}
				graAktywna = false;
			}
			
		}
		
		System.out.println("Liczba gier: " + historiaGry.length + ". Historia gry: ");
		for (String each: historiaGry) {
			System.out.println(each);
		}
	}
	
	public static String podajNazweBroni() {
		System.out.println("Wybierz czym atakujesz? \nPapier - 0 \nNo�yce - 1 \nKamie� - 2");
		boolean poprawna = false;
		Scanner sc = new Scanner(System.in);
		while (!poprawna) {
			try {
				bronUsera = sc.nextLine();
				if (bronUsera.equals("exit")) {
					graAktywna = false;
					break;
				}
				bronUseraInt = Integer.parseInt(bronUsera);
				if (bronUseraInt > 2 || bronUseraInt < 0) {
					System.out.println("Z�a liczba. Podaj cyferk� odpowiadaj�c� danej broni! \nPapier - 0 \nNo�yce - 1 \nKamie� - 2");
				} else {
					poprawna = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Poda�e� nie poprawn� cyfr�");
				System.out.println("Podaj cyferk� odpowiadaj�c� danej broni! \nPapier - 0 \nNo�yce - 1 \nKamie� - 2");
			}
		}
		return bronUsera;
	}
}
