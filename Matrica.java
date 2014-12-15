package matricaPackage;
import java.io.*;
import java.lang.RuntimeException;
public class Matrica {
	/**
	 * funkcija koja prima 2 vrijednosti koje predstavljaju broj redova i kolona matrice,
	 * i kreira matricu od elemenata unesenih od strane korisnika
	 * @param red broj redova matrice
	 * @param kol broj kolona matrice
	 *@return vraca matricu koja je rezultat  mnozenja matrica parametara
	 */
	public static int[][] kreirajMatricu(int red, int kol) {
		int[][] matrica=new int[red][kol];
		for(int i=0;i<red;i++){
			for(int j=0;j<kol;j++){
				System.out.println("Unesite  element matrice sa indexom "+"["+i+"]"+"["+j+"]");
				matrica[i][j]=TextIO.getInt();
				
			}
		}
		return matrica;
	}
	
	
	/**
	 * funkcija koja ispisuje matricu proslijedjenu kao parametar
	 * @param m matrica
	 */
	public static void ispisiMatricu(int[][] m){
		System.out.println("\n");
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
			System.out.printf("%3d ",m[i][j]);
		}
		System.out.println();
		}
		System.out.println("\n");
	}
	/**
	 * funkcija koja prima dvije matrice, ako su razlicitih dimenzija izbacuje se izuzetak,
	 * inace se sabiraju
	 * @param matrica1 prva matrica
	 * @param matrica2 druga matrica
	 * @return matrica kao rezultat sabiranja matrica parametara
	 */
	public static int[][] sabiranje(int[][] matrica1, int[][] matrica2){
		if((matrica1.length!=matrica2.length)||(matrica1[0].length!=matrica2[0].length)){
			throw new IllegalArgumentException("Matrice nije moguce sabrati, razlicitih su dimenzija!");
		}
		else{
		int red=matrica1.length;
		int kol=matrica1[0].length;
		int[][] matrica3=new int[matrica1.length][matrica1[0].length];
		for(int i=0;i<red;i++){
			for(int j=0;j<kol;j++){
				matrica3[i][j]=matrica1[i][j]+matrica2[i][j];
			}
		}
		return matrica3;}
	}
	
	/**
	 * funkcija koja prima dvije matrice, ako su razlicitih dimenzija izbacuje se izuzetak,
	 * inace se oduzimaju
	 * @param matrica1 prva matrica
	 * @param matrica2 druga matrica
	 * @return matrica kao rezultat oduzimanja matrica parametara
	 */
	public static int[][] oduzimanje(int[][] matrica1, int[][] matrica2){
		if((matrica1.length!=matrica2.length)||(matrica1[0].length!=matrica2[0].length)){
			throw new IllegalArgumentException("Matrice nije moguce oduzeti, razlicitih su dimenzija!");
		}
		else{
		int red=matrica1.length;
		int kol=matrica1[0].length;
		int[][] matrica3=new int[matrica1.length][matrica1[0].length];
		for(int i=0;i<red;i++){
			for(int j=0;j<kol;j++){
				matrica3[i][j]=matrica1[i][j]-matrica2[i][j];
			}
		}
		return matrica3;}
	}
	
	/**
	 * funkcija koja prima dvije matrice, ako su razlicitih dimenzija izbacuje se izuzetak,
	 * inace se mnoze(elementi reda jedne sa elementima kolone druge matrice
	 * @param matrica1 prva matrica
	 * @param matrica2 druga matrica
	 * @return matrica kao rezultat mnozenja matrica parametara
	 */
	public static int[][] mnozenje(int[][] matrica1, int[][] matrica2){
		int[][] matrica3;
		if(matrica1[0].length!=matrica2.length){
			throw new IllegalArgumentException("Matrice nije moguce mnoziti, broj kolona prve ne odgovara broju redova druge!");
		}
		else{
			int m=matrica1.length;
			int n=matrica1[0].length;
			int k=matrica2[0].length;
		
			matrica3=new int[m][k];			
			for(int i=0;i< m-1;i++){
			for(int j=0;j< k-1; j++){
			 matrica3[i][j]=0;
			for(int l=0; l< n-1; l++){
			 matrica3[i][j]+=matrica1[i][l]*matrica2[l][j];
			}
			}
			}
			}
		return matrica3;
	}
	
	/**
	 * funkcija koja prima dvije matrice, ako su razlicitih dimenzija izbacuje se izuzetak,
	 * inace se sabiraju
	 * @param matrica1 prva matrica
	 * @param matrica2 druga matrica
	 * @return matrica kao rezultat sabiranja matrica parametara
	 */
	public static double[][] sabiranje(double[][] matrica1, double[][] matrica2){
		if((matrica1.length!=matrica2.length)||(matrica1[0].length!=matrica2[0].length)){
			throw new IllegalArgumentException("Matrice nije moguce sabrati, razlicitih su dimenzija!");
		}
		else{
		int red=matrica1.length;
		int kol=matrica1[0].length;
		double[][] matrica3=new double[matrica1.length][matrica1[0].length];
		for(int i=0;i<red;i++){
			for(int j=0;j<kol;j++){
				matrica3[i][j]=matrica1[i][j]+matrica2[i][j];
			}
		}
		return matrica3;}
	}
	
	/**
	 * funkcija koja prima dvije matrice, ako su razlicitih dimenzija izbacuje se izuzetak,
	 * inace se oduzimaju
	 * @param matrica1 prva matrica
	 * @param matrica2 druga matrica
	 * @return matrica kao rezultat oduzimanja matrica parametara
	 */
	public static double[][] oduzimanje(double[][] matrica1, double[][] matrica2){
		if((matrica1.length!=matrica2.length)||(matrica1[0].length!=matrica2[0].length)){
			throw new IllegalArgumentException("Matrice nije moguce oduzeti, razlicitih su dimenzija!");
		}
		else{
		int red=matrica1.length;
		int kol=matrica1[0].length;
		double[][] matrica3=new double[matrica1.length][matrica1[0].length];
		for(int i=0;i<red;i++){
			for(int j=0;j<kol;j++){
				matrica3[i][j]=matrica1[i][j]-matrica2[i][j];
			}
		}
		return matrica3;}
	}
	
	/**
	 * funkcija koja prima dvije matrice, ako su razlicitih dimenzija izbacuje se izuzetak,
	 * inace se mnoze(elementi reda jedne sa elementima kolone druge matrice
	 * @param matrica1 prva matrica
	 * @param matrica2 druga matrica
	 * @return matrica kao rezultat mnozenja matrica parametara
	 */
	public static double[][] mnozenje(double[][] matrica1, double[][] matrica2){
		double[][] matrica3;
		if(matrica1[0].length!=matrica2.length){
			throw new IllegalArgumentException("Matrice nije moguce mnoziti, broj kolona prve ne odgovara broju redova druge!");
		}
		else{
			int m=matrica1.length;
			int n=matrica1[0].length;
			int k=matrica2[0].length;
		
			matrica3=new double[m][k];			
			for(int i=0;i< m-1;i++){
			for(int j=0;j< k-1; j++){
			 matrica3[i][j]=0;
			for(int l=0; l< n-1; l++){
			 matrica3[i][j]+=matrica1[i][l]*matrica2[l][j];
			}
			}
			}
			}
		return matrica3;
	}
	
	/**
	 * funkcija koja prima matricu i transponira je, odnosno cini da elementi reda postanu elementi kolone i obratno.
	 * @param matrica matrica
	 * @return transponirana matrica
	 */
	public static int[][] transponuj(int[][] matrica){
		int vel=matrica.length;
		int[][] matricaT=new int[vel][vel];
		for (int i=0;i<vel;i++){
			for(int j=0;j<vel;j++){
				matricaT[i][j]=matrica[j][i];
			}
		}
		return matricaT;
	}
	
public static void main(String[] args) {
	int red, kol,red2,kol2;
	char op, strC;
	String strBr=new String();
	TextReader data =new TextReader(new FileReader("d:\\FileZaCitanje.txt"));
	red=data.getInt();
	System.out.println(red);
	kol=data.getInt();
	System.out.println(kol);
	int[][] matrica=new int[red][kol];
	for(int i=0;i<red;i++){
		for(int j=0;j<kol;j++){
			 { 

				int br = data.getInt();
			matrica[i][j]=br;
			//System.out.println(br);
			System.out.print(matrica[i][j]+" ");
		//}
		}
	}
	}
	System.out.println("\n");
for(int i=0;i<red;i++){
		System.out.println();
		for(int j=0;j<kol;j++){
			System.out.print(matrica[i][j]+" ");
		}
}

	red2=data.getInt();
	System.out.println();
	System.out.println(red2);
	kol2=data.getInt();
	System.out.println(kol2);
	int[][] matrica2=new int[red2][kol2];
	
	for(int i2=0;i2<red2;i2++){
		for(int j2=0;j2<kol2;j2++){
			 { 
				 int br = data.getInt();
				 matrica2[i2][j2]=br;
			//System.out.println(br);
			//System.out.print(matrica[i2][j2]+" ");
		//}
		}
	}
	}

for(int i2=0;i2<red2;i2++){
		System.out.println();
		for(int j2=0;j2<kol2;j2++){
			System.out.print(matrica2[i2][j2]+" ");
		}
}
	op=data.getlnChar();

	
}
}
		
