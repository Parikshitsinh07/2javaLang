//7 Parsing Out String by using Substing Of string class

class  {
    public static void main(String[] agrs) {
		String s1 = "The total cost is $45.67";
			int i1 = s1.indexOf('$');
			String s2 = s1.substring(i1);
			//System.out.println(i1);
			System.out.println(s2);
		
	}
}