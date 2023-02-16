public class Sentence {
	
	private String text;
	
	public Sentence(String text)
	{
		this.text = text;
	}

   public boolean isPalindrome() {
      String check = "";
      for (int i = 0; i < text.length(); i++) {
         if (Character.isLetterOrDigit(text.charAt(i))) {
            check += text.charAt(i);
         }
      }
      return isPalindrome(check.toLowerCase(), 0, check.length() - 1);
   }
   
   // helper
   private boolean isPalindrome(String text, int start, int end) {
      
      char s = text.charAt(start);
      char e = text.charAt(end);

      // base case
      if (start >= end) return true;
      if (s != e) return false;
      return isPalindrome(text, start + 1, end - 1);
      // not a palindrome is another base case
      // simplify and call recursion
      // Madam, I'm Adam!
      /*if (!Character.isLetterOrDigit(e)) {
         return isPalindrome(text, start, end - 1);
      }
      else if (!Character.isLetterOrDigit(s)) {
         return isPalindrome(text, start + 1, end);
      }
      else {
         if (s != e) return false;
         return isPalindrome(text, start + 1, end -1);
      }*/
      // combine, sometimes, or creativity
   
   }

      /*   
      char first = text.charAt(start);
      char last = text.charAt(end);
      
      if (end - start <= 1) { // start >= end
         return true;      
      }
      if (Character.isLetter(first)) {
         if (Character.isLetter(last)) {
            if (first != last) {
               return false;
            }
            return isPalindrome(text, start + 1, end - 1);
         }
         return isPalindrome(text, start, end - 1);
      }
      return isPalindrome(text, start + 1, end);
      */

}
