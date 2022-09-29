package strings;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugun yemekte ne var.";
		System.out.println(mesaj);
		
		System.out.println("Cumledeki eleman sayisi:"+mesaj.length());
		System.out.println("5. eleman:"+ mesaj.charAt(4));
		//charAt icine yazılan indexdeki harfi gosterir
		
		System.out.println(mesaj.concat("Pasta yiyelim !"));
		//.concat cumlenin sonuna eklenmek istenen mesaji birlestirir
		System.out.println(mesaj.startsWith("B"));
		//startsWith booleandir icine yazılan harf ile basliyosa true baslamıyorsa false dondurur.
		System.out.println(mesaj.endsWith("a"));
		//endsWith de ayni sekilde 
		
		char[] karakter=new char[5];
		mesaj.getChars(0,5,karakter,0);
		System.out.println(karakter);
		//.getChars direkt sys olmadan yazilir ve bir array e ihtiyac duuyar
		System.out.println(mesaj.indexOf("ye"));
		//.indexOf icine yazılan charin veya yazinin indexini bulur
		System.out.println(mesaj.lastIndexOf("et"));
		//ayni mantıkta calisir sadece cumleye tersten saymaya baslar
	
		System.out.println(mesaj.substring(2,5));
		//verilen index araligindaki harfleri yazdirir
		
		for(String kelime : mesaj.split(" ")) {
		System.out.println(kelime);
		//splitin icine yazilan seylere kadar alt alta yazar
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		//basına ve sonuna bosluk ekler
		
		
	}
	
}
