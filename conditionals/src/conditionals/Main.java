package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi=10;
		if(sayi<20) {
			System.out.println("sayi 20 den kucuk");
		}
		if(sayi<15) {
			System.out.println("sayi 15 den kucuk");
		}
		else if(sayi ==20) {
			System.out.println("sayi 20 dir");
		}
		
		else{
			System.out.println("sayi 20 den kucuk degildir");
		}
	}
	

}
