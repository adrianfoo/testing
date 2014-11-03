/*
 * author Adrian
 */

package jenkinsTest;

public class StringAdd {
	public static void main(String[] args){
		StringAdd add = new StringAdd();
		System.out.println(add.addTogether("one", "two"));
	}
	public String addTogether(String one, String two){
		return one+two;
	}

}
