package interfaceNEW;

public class CLIENT implements 	INTERFACE{

	@Override
	public void callback(int p) {
		System.out.println("callback called with => "+p);
		
	}
	void nonInterfaceMethod()
	{
		System.out.println("can have another method ");
	}
	

}
