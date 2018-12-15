
public class Test {

	public static void main(String[] args) {
		
		Farben gelb = Farben.GELB;
		System.out.println(gelb);
		int pos = gelb.ordinal(); 
		System.out.println(pos);
		
		
		
		Farben[] arr = Farben.values();
		
		for (Farben whatever : arr) {
			
			System.out.println(whatever);

		
		}
		
		
		Farben blau = Farben.BLAU; 
		
		String s = blau.getRGB(); 
		System.out.println(s);

		
	}
	
}
