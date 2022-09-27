package arrays;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler= new String[3];
		ogrenciler[0]="kuromi";
		ogrenciler[1]="kitty";
		ogrenciler[2]="marshmallow";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		} 
		System.out.println("------------------");
		//ayni kod bu sekilde de yazabiliriz
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		double[] numbers = {1.2,2.3,3.4,4.5};
		double total=0;
		double max=numbers[0];
		double min=numbers[1];
		
		for(int i=0;i<numbers.length;i++) {
			total=total + numbers[i];
			System.out.println(numbers[i]);
			if(max<numbers[i]) {
				max=numbers[i];
			}
			if(min>numbers[i]) {
				min=numbers[i];
			}
			
		}
		System.out.println("toplam:"+total);
		System.out.println("max deger:"+max);
		System.out.println("min deger"+min);
		
	//iki dizi olusturup degerleri atayarak yazdırmayı denedim
		int i=0;
		int[] mylist=new int[4];
		int[] mylistnumber = {1,2,3,4};
		for(int j=1;j<mylist.length;j++) {
			if(mylist.length==mylistnumber.length) {
				mylist[i]=mylistnumber[i];
				System.out.println(mylist[i]);
				i++;
			} 
		}
		
		
		
		
		
		
		
		
		
	}

}
