/*
 * @author Adrian
 */

package jenkinsTest;

public class StringAdd {
	public static void main(String[] args){
		StringAdd test = new StringAdd();
		String add = test.addTogether("Hello", "World");
		System.out.println(add);
	}
	public String addTogether(String one, String two){
		return one+two;
	}
	
}
