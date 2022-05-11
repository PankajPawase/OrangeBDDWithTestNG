package PankajGitBash;

public class StringPalindrome {

	public static void main(String[] args) {
		String ab="nayan";
		String temp="";
		for(int i=ab.length()-1;i>=0;i--)
		{
			temp=temp+ab.charAt(i);
		}
		if(ab.equals(temp))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
