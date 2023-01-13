package interfaces;

public class Person implements Student,YouTuber{

	public static void main(String[] args) {
		
		Person obj=new Person();
//		obj.study();
//		obj.makeVideo();
      
//		YouTuber ob=new YouTuber();
		YouTuber ob=obj;  //upcasting
		ob.editVideo();
		ob.makeVideo();
		ob.Gym();
	}

	@Override
	public void makeVideo() {
		System.out.println("I AM A YOUTUBER");
		
	}

	@Override
	public void study() {
		System.out.println("I AM A STUDENT");
		
	}

	@Override
	public void editVideo() {
		System.out.println("Editor is editing");
		
	}

	@Override
	public void Gym() {
		System.out.println("GYMMING");
		
	}

}
