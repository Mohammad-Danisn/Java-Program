package Level2;

import java.util.ArrayList;
import java.util.List;

import com.ritroorkee.Secretary;

public class Department {

	public static void main() {
		
		List<Department> ss = new ArrayList<Department>();

		Department aman = new Department(22);
		ss.add(aman);
		
		Department sx = new Department(1);
		ss.add(sx);

		Secretary maurya = new Department(3);
		ss.add(maurya);
				
	}
	
}
