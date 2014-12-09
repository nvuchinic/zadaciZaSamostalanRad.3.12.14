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
	
public static void main(String[] args) {
	int red,kol;
	//System.out.println("Unesite broj redova i kolona matrice:");
	//red=TextIO.getInt();
	//kol=TextIO.getInt();

	/*int[][] matrica1=new int[red][kol];
	int[][] matrica2=new int[red][kol];*/
	int[][] matrica1=new int[][]{{1,0},{2,5},{0,3}};
	int[][] matrica2=new int[][]{{2,0,3},{1,-1,0}};
	int[][] matrica3=new int[matrica1.length][matrica2[0].length];
	matrica3=mnozenje(matrica1, matrica2);
	/*matrica1=kreirajMatricu(red, kol);
	System.out.println("Matrica 1");
	ispisiMatricu(matrica1);
	matrica2=kreirajMatricu(red, kol);
	System.out.println("Matrica 2");
	ispisiMatricu(matrica2);
	int[][] matrica3=new int[red][kol];
	matrica3=sabiranje(matrica1, matrica2);
	System.out.println("Matrica 3(matrica 1+matrica 2");
	ispisiMatricu(matrica3);*/
	ispisiMatricu(matrica3);

	
}
}
		
