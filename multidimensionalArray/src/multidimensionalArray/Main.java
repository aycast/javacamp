package multidimensionalArray;

public class Main {

	public static void main(String[] args) {
		String[][] yemekler = new String[3][3];
		
		yemekler[0][0] ="dondurma";
		yemekler[0][1] ="cikolata";
		yemekler[0][2] ="pasta";
		yemekler[1][0] ="borek";
		yemekler[1][1] ="peynir";
		yemekler[1][2] ="kasar";
		yemekler[2][0] ="pizza";
		yemekler[2][1] ="makarna";
		yemekler[2][2] ="hamburger";
		
		for(int i=0;i<=2;i++) {
			System.out.println("-----------");
			for(int j=0;j<=2;j++) {
				System.out.println(yemekler[i][j]);
			}
		}
	}

}
