
public class StringCalculator {
	public static int add(String test){
		  if(test.equals("")) {
			  return 0;
		  }
		  else if(test.contains(",")) {
			  String[] numbers=test.split(",");
			  return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
		  }
		  else {
			  return Integer.parseInt(test);
		  }
		}
}
