package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi=10;
		int kalan= sayi%2;
		
		if(sayi<2) {
			System.out.println("gecersiz sayi");
		}
		if(sayi==2) {
			System.out.println("sayi asaldir");
		}
		
		
		for(int i=2;i<sayi;i++) {
			if(sayi %i ==0) {
				System.out.println("asal degil");
				break;
			}
			else{
				System.out.println("sayi asaldir");
				break;
			}
			
		}
	
	}

}
