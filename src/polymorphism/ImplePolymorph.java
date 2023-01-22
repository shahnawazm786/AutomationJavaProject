package polymorphism;

public class ImplePolymorph {
	public static void main(String[] args) {
		PolymorphismExample pe=new PolymorphismExample();
		System.out.println(String.valueOf(pe.add(100, 200)));
		System.out.println(String.valueOf(pe.add(100, 20.67f)));
		System.out.println(String.valueOf(pe.add(100.89f, 20.67f)));
	}

}
