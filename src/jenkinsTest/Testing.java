package jenkinsTest;

public class Testing {
		public static void main(String[] args){
			Testing test = new Testing();
			System.out.println(test.addTogether("abc", "def"));
		}
		public String addTogether(String abc, String def){
			return abc+def;
		}

}
