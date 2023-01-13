package interfaceNEW;

public class TESTINTERFACE2 {

	public static void main(String[] args) {

    INTERFACE ob1=new CLIENT();
    ANOTHERCLIENT obj=new ANOTHERCLIENT();
    
    ob1.callback(42);
    ob1=obj;
    obj.callback(42);

	}

}
