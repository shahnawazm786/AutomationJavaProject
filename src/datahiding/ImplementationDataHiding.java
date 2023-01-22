package datahiding;

public class ImplementationDataHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateSpecifierExample pse=new PrivateSpecifierExample(); //pse is now called it object of Private
		pse.setAdharNo(12);
		System.out.println(pse.getAdharNo());
		System.out.println("Public Variables");
		PublicSpecifierExample pv=new PublicSpecifierExample();
		pv.lectureNo=1200;
		ProtectedSpecifierExample p=new ProtectedSpecifierExample();
		p.lectureHour=120;
		DefaultSpecifierExample ds=new DefaultSpecifierExample();
		ds.lectureName="Java Lecture";
	}

}
