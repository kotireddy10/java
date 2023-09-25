package operators;

public class Conditionaloperator {

	public static void main(String[] args) {
		
		int i=20;
		int j=30;
		int k=40;
		// &&(and) operator
		System.out.println(i<j && j>i);
		System.out.println(i<j && j<i);
		System.out.println(j>k && k>j);
		System.out.println(k==i && k<i);
		
		// ||(or) operator
		System.out.println(i<j || j>i);
		System.out.println(i<j || j<i);
		System.out.println(j>k || k>j);
		System.out.println(k==i || k<i);
		
	}

}
