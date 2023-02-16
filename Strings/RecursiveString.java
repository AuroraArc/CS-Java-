import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveString {
	private String str;
	private String sub;
	private int index;
	public RecursiveString (String str, String sub, int index) {
		this.str = str;
		this.sub = sub;
		this.index = index;
	}

	public boolean isStringPresent() {
    	if (sub.length() == 0) {
    		index = -1;
        	return true;
	   	} 
    	else if (str.length() < sub.length()) {
    		index = -1;
        	return false;
	    } 
	    else if (str.substring(0, sub.length()).equals(sub)) {
	    	return true;
	    }
    	else {
    		index++;
    		str = str.substring(1);
        	return isStringPresent();
	    }
	}

	public int getIndex() {
		return index;
	}

	public static void main(String[] args) {
		RecursiveString recurString = new RecursiveString("substring", "ring", 0);
		System.out.println(recurString.isStringPresent());
		System.out.println("Index: " + recurString.getIndex());
	}
}