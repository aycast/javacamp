
public class Main {

	public static void main(String[] args) {
		int number1 =255;
		int number2 =3000;
		int number3 =4;
		
		int enb=number1;
		int enk=number2;
		
		if(number1<number3) {
			if(number2<number3) {
				enb=number3;
				if(number1<number2) {
					enk=number1;
				}
				
			}
		}
		if(number1<number2) {
			if(number3<number2) {
				enb=number2;
				if(number3<number1) {
					enk=number3;
				}
			}

		}
		if(number2<number1) {
			if(number3<number1) {
				enb=number1;
				if(number2<number3) {
					enk=number2;
				}
				
			}
		}
		System.out.println("en buyuk sayi:"+ enb);
		System.out.println("en kucuk sayi:"+enk);
	}

}
