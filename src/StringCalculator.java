
public class StringCalculator {
	public static int add(String test){
		  if(test.equals("")) {
			  return 0;
		  }
		  else if(test.contains(",")) {
			  String[] numbers=test.split(",|\n");
			  int total = 0;
			  for(String number : numbers){
			    total += Integer.parseInt(number);
			  }
			  return total;
		  }
		  else {
			  return Integer.parseInt(test);
		  }
		}
}
