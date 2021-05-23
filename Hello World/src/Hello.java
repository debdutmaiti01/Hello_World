
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1 = 2;
		int value2 = 10;
		String value3 = "hello world debdut!!";
		String artDetails;
		boolean x = !(value1 < value2);
		boolean y =(value1 < value2)?true:false;
		
		if( value1 == value2)
		{
			System.out.println(value1+value2);
			System.out.println("Value are equal");
		}
		else
		{
			System.out.println("Value are not equal");
				}
		
		System.out.println(x);
		System.out.println(y);
		
		looping(5,12);
		
		Art myArt = new Art();
		myArt.setArt("Art1", "Artist1", 100);
		artDetails=myArt.getArt();
		
		System.out.println(artDetails);
		System.out.println(myArt.ArtCategory());
	}

	
	public static void looping(int i,int till) {
		int counter=i ;
		while( counter <till) {
			System.out.println(counter);
			counter++;
		}
	}
}
