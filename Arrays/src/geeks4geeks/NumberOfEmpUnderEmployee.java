package geeks4geeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NumberOfEmpUnderEmployee {

	
	public static void main(String[] args) {
		
		Map<String, String> empMgrMap= new HashMap<String,String>();
		empMgrMap.put("A", "C");
		empMgrMap.put("B", "C");
		empMgrMap.put("C", "F");
		empMgrMap.put("D", "E");
		empMgrMap.put("E", "F");
		empMgrMap.put("F", "F");
		
		
		//manager contains number of emp
		Set<String> set = empMgrMap.keySet();
		Iterator<String> iterator = set.iterator();
		HashMap<String,List<String>> mgrEmpMap = new HashMap<String,List<String>>();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			List<String> empList = mgrEmpMap.get(empMgrMap.get(key));
			if(empList == null ) {
				empList=new ArrayList<String>();
			}
			if(!empList.contains(key)) {
				
				empList.add(key);
			}
			mgrEmpMap.put(empMgrMap.get(key), empList);
		 }
		Set<String> managers = mgrEmpMap.keySet();
		Iterator<String> itr = managers.iterator();
		while(itr.hasNext()) {
			List<String> list = mgrEmpMap.get(itr.next());
			int numbEmployee =calculateNumberOfEmployee(mgrEmpMap, list);
		}
		
		
		System.out.println(mgrEmpMap); 
		
	}

	public static int calculateNumberOfEmployee(HashMap<String, List<String>> mgrEmpMap, List<String> list) {
		int counter = 0;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
		return 0;
	}
}
