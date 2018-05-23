package intermedio2;

import java.util.Random;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[4][5];
		for(int i=0; i<4;i++) {
			for(int j=0; j<5;j++) {
				matrix[i][j]=new Random().nextInt(100);
			}
		}
		for(int i=0; i<4;i++) {
			for(int j=0; j<5;j++) {
				System.out.print(" Valor en: ("+i+","+j+"): "+matrix[i][j]);
			}
			System.out.println();
		}
	}

}
