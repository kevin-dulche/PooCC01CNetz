public class SegundaMatriz {
	public static void main(String[] args) {
		int [][]m2 = new int[2][];
		m2[0] = new int[2];
		m2[1] = new int[3];
		m2[0][0] = 2;
		m2[0][1] = 8;
		m2[1][0] = 10;
		m2[1][1] = 3;
		m2[1][2] = 7;	

		System.out.println("m2[0][1]= " + m2[0][1]);
		System.out.println("m2[1][1]= " + m2[1][1]);
		for(int i = 0; i < m2[0].length; i++) {
			for(int j = 0; j < m2[i].length; j++) {
				System.out.println("m2[" + i + "][" + j + "]= " + m2[i][j]);	
			}
		}				
	}
}