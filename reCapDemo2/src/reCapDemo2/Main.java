package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] myList = {1.2,2.2,3,4};
		double total = 0;
		double max = myList[0];
		
		for (double number : myList) {
			if(max<number) {
				max=number;
			}
			total+=number;
			System.out.println(number);
			System.out.println(total);
			System.out.println("----------");
			
		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük sayımız: " + max);
	}

}
