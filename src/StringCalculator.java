
public class StringCalculator {
	public static int add(String test){
		  if(test.equals("")) {
			  return 0;
		  }
		  else if(test.length()>1){
			  String delimiter=",";
			  if(test.matches("//(.*)\n(.*)")){
				  delimiter=Character.toString(test.charAt(2));
				  test=test.substring(4);
			  }
			  String[] numbers=test.split(delimiter+"|\n");
			  int total = 0;
			  String negativeString = "";
			  for(String number : numbers){
				  if(Integer.parseInt(number) < 0){
		        		if(negativeString.equals(""))
		        			negativeString = number;
		        		else
		        			negativeString += ("," + number);
				  }
				  if(Integer.parseInt(number)<1000 & Integer.parseInt(number)>0) {
					  total += Integer.parseInt(number);
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
