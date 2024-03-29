package Level2;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ritroorkee.Secretary;

public class ComparisionMain {

	public static void main(String[] args) {
		List<Secretary> ss = new ArrayList<Secretary>();

		Secretary aman = new Secretary(22, "XAman", "HR");
		ss.add(aman);

		Secretary sx = new Secretary(1, "Sikha", "CSE");
		ss.add(sx);

		Secretary maurya = new Secretary(3, "Maurya G", "XABC");
		ss.add(maurya);

		Secretary anand = new Secretary(22, "Anand", "HR");
		ss.add(anand);

		Secretary anant = new Secretary(1, "Anant", "Mech");
		ss.add(anant);

		Secretary danish = new Secretary(3, "Danish G", "CSE");
		ss.add(danish);

		
		
//		ss.forEach(s -> System.out.println(s));
//		Collections.sort(ss, (o1, o2) -> o2.getName().compareTo(o1.getName()));
//		System.out.println("----After SOrt---");
//		ss.forEach(s -> System.out.println(s));
//		System.out.println("--- sort by dept name ---- ");
//		Collections.sort(ss, new Comparator<Secretary>() {

		
		ss.forEach(s -> System.out.println(s));
		Collections.sort(ss, 
				Comparator.comparing(Secretary::getDept)
				.thenComparing(Secretary::getName));
		ss.forEach(s -> System.out.println(s));
		
		
		
//			@Override
//			public int compare(Secretary o1, Secretary o2) {
//				return o2.getDept().compareTo(o1.getDept());
//			}

//		});
		
		ss.forEach(s -> System.out.println(s));


	}
}