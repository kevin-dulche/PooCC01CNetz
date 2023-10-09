public class PrimeraMatriz {
	public static void main(String[] args) {
		double [][]m = new double[2][4];
		m[0][0] = 2;
		m[0][1] = 4;
		m[0][2] = 8;
		m[0][3] = 10;
		m[1][0] = 3;
		m[1][1] = 7;
		m[1][2] = 11;
		m[1][3] = 13;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("m[" + i + "][" + j + "]= " + m[i][j]);	
			}
		}
		
		
	}
}