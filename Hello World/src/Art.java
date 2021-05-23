
public class Art {
	
	private String Artname;
	private String Artist;
	private int Artprice;
	
	public void setArt(String An, String A, int Ap) {
		this.Artname = An;
		this.Artist = A;
		this.Artprice = Ap;
	}
	
	public String getArt() {
	
		return(Artname+Artist+Artprice);
		
	}
	
	public String ArtCategory() {
		if(Artprice>150) { return "expensive";} else { return "cheap" ;}
	}
	
}
