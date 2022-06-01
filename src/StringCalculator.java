
public class StringCalculator {
	public static int add(String test){
		  if(test.equals("")) {
			  return 0;
		  }
		  else if(test.contains(",")) {
			  String[] numbers=test.split(",|\n");
			  int total = 0;
			  String negativeString = "";
			  for(String number : numbers){
				  if(Integer.parseInt(number) < 0){
		        		if(negativeString.equals(""))
		        			negativeString = number;
		        		else
		        			negativeString += ("," + number);
				  }  
			  }
			  if(!negativeString.equals("")){
				  throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
			  }
			  return total;
		  }
		  else {
			  return Integer.parseInt(test);
		  }
	}
}
