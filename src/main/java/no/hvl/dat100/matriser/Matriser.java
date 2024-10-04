package no.hvl.dat100.matriser;



public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[]rad : matrise ) {
			for(int element : rad) {
				System.out.println(element + "");
			}
			System.out.println();
		}
		
	
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder sb = new StringBuilder();
		for (int[]rad : matrise ) {
			for(int element : rad) {
				sb.append(element).append("");
			}
			sb.append("\n");
		}
		return sb.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int [matrise.length][matrise[0].length];
		for (int i = 0; i< matrise .length; i++) {
			for(int j = 0; j<matrise [i].length;j++) {
				resultat [i][j] = matrise [i][j]*tall;
			}
		}
		return resultat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length)return false;
		for(int i = 0 ; i < a.length; i++) {
			if(a[i].length != b[i].length)return false;
			for(int j = 0; j <a[i].length; j++) {
				if(a[i][j] != b[i] [j]) return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] resultat = new int[matrise[0].length][matrise.length];
		
		for(int i = 0 ; i <matrise .length;i++) {
			for (int j = 0 ; j < matrise [i].length; j++) {
				resultat[j][i] = matrise [i][j];
			}
		}
		return resultat;
	}


	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		if(a[0].length != b.length) {
			throw new IllegalArgumentException(" matrix dimension do math for multipication ");
			
		}
		
	 int [][] resultat = new int[a.length][b[0].length]; 
	 
	 
	 for(int i = 0 ; i < a.length;i++) {
		 for(int j = 0; j< b[0].length;j++) {
		 for(int k = 0 ; k < a[0].length; k++) {
			 resultat [i][j]+= a[i][k] * b[k][j];
		 }
	 }
	 
	}
	return resultat;
	}
}
