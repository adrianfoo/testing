// Filename:		StringAdd.java
// Created:			11/4/1014
// Last Changed:	11/4/1014 09:32:00
// Author:			Adrian

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
