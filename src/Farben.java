
public enum Farben {

	ROT("255,0,0"), GELB("0, 255, 0"), BLAU("0,0,0"); 
	

	
	private final String rgb; 
	
	Farben(String rgb) {
		
		this.rgb = rgb; 
	}
	
	
	String getRGB() {
		return rgb;
	}
	
}



