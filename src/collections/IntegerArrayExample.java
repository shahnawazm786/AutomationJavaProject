package collections;

public class IntegerArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] interest_rate= {10,11,12}; //inline decalaration
		//interest_rate[0]=10;
		//interest_rate[1]=11;
		//interest_rate[2]=12;
		System.out.println(interest_rate[0]);
		System.out.println(interest_rate[1]);
		System.out.println(interest_rate[2]);
		
		int[] a=new int[3]; //after declaration you can't shrink and grow (capacity is fixed)
		a[0]=10;
		a[1]=11;
		a[2]=12;
		//a[3]=15;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//System.out.println(a[3]);
		
		int[] marks= {20,30,40,50,60,100};
		int temp=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(temp<marks[i]) {
				temp=marks[i];
			}
		}
		System.out.println("Max value is "+ temp);
		
		int min=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<min) {
				min=marks[i];
			}
		}
		System.out.println("Min value is "+ min);
		
	}

}
