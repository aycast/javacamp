package switchDemo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Oyuna baslamak icin :A  ");
		System.out.println("kaldigin yerden devam etmek icin :B ");
		System.out.println("oyunu kaydetmek icin :C");
		System.out.println("oyundan cikmak icin :D\n");
		
		char game='A';
		switch(game) {
		case 'A':
			System.out.println("oyun baslatiliyor..");
			break;
		
		case 'B':
			System.out.println("oyuna devam ediliyor ");
			break;
		case 'C':
			System.out.println("kaydediliyor");
			break;
		case 'D':
			System.out.println("oyun kapatiliyor");
			break;
		default:
			System.out.println("beklenmeyen bir hata olustu lutfen tekrar girin");
			
				
		}
	}

}
