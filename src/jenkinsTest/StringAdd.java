// Filename:		StringAdd.java
// Created:			2014/04/11
// Last Changed:	2014/04/11 09:32:00
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

	public void printHelloWorld(){
		System.out.println("Hello World");
	}
	
	public void printJenkins(){
		System.out.println("Jenkins");
	}
	public void printSonar() {
		System.out.println("Sonar");
	}
	public void printJenkinsSonar(){
		System.out.println("Jenkins Sonar");
	}
	public void printLALA(){
		System.out.println("hah");
	}
}
