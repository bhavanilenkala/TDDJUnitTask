package tasks.epam.JUnitTDDTask;

public class RemoveCharA {
    
	public String removeCHAR(String str) {
		String result="";
		char firstChar = str.charAt(0);
		char SecondChar = str.charAt(1);
		if(str.length()<1 || (firstChar != 'A' && SecondChar !='A'))
			result=str;
		else {
			if(firstChar =='A' && SecondChar == 'A')
				result=str.substring(2,str.length());
			else if(firstChar =='A')
				result=str.substring(1,str.length());
			else if(SecondChar == 'A')
				result=str.substring(0,1)+str.substring(2,str.length());
			}
		return result;
	}
}
