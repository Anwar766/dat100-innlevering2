package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int tall : tabell) {
			System.out.println(tall + "");
		}
		
		System.out.println();

	}

	// b)
	public static String tilStreng(int[] tabell) {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < tabell.length; i++) {
			sb.append(tabell[i]);
			if(i< tabell.length-1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0 ; 
		for(int  tall : tabell) {
			sum += tall;
			
		}
   return sum;
	
	}


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int t : tabell) {
			if (t == tall) {
				return true;
			} 
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length;i ++) {
			if (tabell [i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] reversert = new int [tabell.length];
		for ( int i = 0 ;i < tabell.length; i++) {
			reversert [i] = tabell[tabell.length -1 -i]; 
		}
		return reversert ;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for ( int i = 1; i < tabell.length ; i++) {
			if(tabell [i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
			
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] sammensatt = new int [tabell1.length  + tabell2 .length] ;
		System.arraycopy(tabell1, 0, sammensatt, 0, tabell1.length);
		System.arraycopy(tabell2, 0, sammensatt, tabell1.length, tabell2 .length);
		return sammensatt;
	}
}
