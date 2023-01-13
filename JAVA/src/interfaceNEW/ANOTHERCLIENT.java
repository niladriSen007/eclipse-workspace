package interfaceNEW;

public class ANOTHERCLIENT implements INTERFACE{

	@Override
	public void callback(int p) {
		System.out.println("another version of callback");
		System.out.println("p square is=>"+(p*p));
		
	}
	
	

}
