package Lab_10;
/*@author Somit Jain*/
import java.util.*;
public class HashMap_L10{
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> m1 = new HashMap<>();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("Enter the student name");
			String name = input.next();
			System.out.println("Enter the number of subjects");
			int n = input.nextInt();
			ArrayList<String> a = new ArrayList<>();
			for(int j=0;j<n;j++) {
				String s = input.next();
				a.add(s);
			}
			m1.put(name, a);
		}
		HashMap<String,String> m2 = new HashMap<String,String>();
		for(int i=0;i<4;i++){
			System.out.println("Enter the subject name");
			String subject = input.next();
			System.out.println("Enter the teacher name");
			String teacher = input.next();
			m2.put(subject, teacher);
		}
		for(Map.Entry<String, ArrayList<String>> j:m1.entrySet()){
			System.out.println(j.getKey() + ":" + j.getValue());
		}
		System.out.println();
		for(Map.Entry<String, String> j:m2.entrySet()){
			System.out.println(j.getKey() + ":" + j.getValue());
		}
		System.out.println();
		String s = "C";
		String s1[] = new String[4];
		ArrayList<String> subjects = new ArrayList<String>();
		for(Map.Entry<String, ArrayList<String>> j:m1.entrySet()) {
			if(j.getKey().equals(s)){
				subjects = (ArrayList<String>)j.getValue().clone();
			}
		}
		subjects.toArray(s1);
		for(int k = 0;k<s1.length;k++){
			for(Map.Entry<String,String> j:m2.entrySet()){
				if(j.getKey().equals(s1[k])){
					System.out.println(j.getValue());
				}
			}
		}
	}
}
