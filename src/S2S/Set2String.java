package S2S;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set2String {

	
	public static String s = "[\"a\",\"b\",\"c\"]";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> ss = new HashSet<String>();
		Set<String> ss1 = new HashSet<String>();

		//System.out.println(s);
		String s1 = (String) s.subSequence(1, (s.length()-1));
		String s2 = s1.replaceAll("\"", "");
		String[] sf = (String[]) s2.split(",");
		System.out.println(Arrays.toString(sf));
		for(int i =0;i<sf.length;i++)
		{
			System.out.println(sf[i]);
			ss1.add(sf[i]);
		}
		for(int i = 0; i<sf.length;i++)
		{
			ss.add(sf[i]);
		}
		System.out.println(ss);
		System.out.println(ss1);
	}

}
