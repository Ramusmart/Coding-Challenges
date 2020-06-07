import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateOfArray {
	
	public void duplicateOfArray1() {
		
		System.out.println("Hello World");
		int inputArray[] = {1,2,5,5,6,6,7,2};
		int index=0;
		int outputArray[] = new int[20];
		
		
		if(inputArray.length>1)
		{
			for(int i=0;i<inputArray.length-1;i++)
			{
				for(int j=i+1;j<inputArray.length;j++)
				{
					if(inputArray[i]==inputArray[j])
					{
						System.out.println("Output :"+inputArray[i]);
					}
				}
			}
		}
		
		
	}
	
	public void duplicateOfArray2() {
		System.out.println("Hello World");
		int inputArray[] = {1,2,5,5,6,6,7,2};
		int index=0;
		int outputArray[] = new int[20];
		
		
		if(inputArray.length>1)
		{
			for(int i=0;i<inputArray.length-1;i++)
			{
				for(int j=i+1;j<inputArray.length;j++)
				{
					if(inputArray[i]==inputArray[j])
					{
						outputArray[index]=inputArray[j];
						index = index+1;
					}
				}
			}
		}
		String stringArr = Arrays.toString(outputArray);
		System.out.println("Output :"+stringArr);
		
	}
	
	public void duplicateOfArrayUsingCollections() {
		Map<Integer,Integer> map = new HashMap<>();
		int inputArray[] = {1,2,5,5,5,6,6,7,2,1};
		for(Integer input : inputArray) {
			Integer count = map.get(input);
			if(count==null) {
				map.put(input, 1);
			}else {
				map.put(input,++count);
			}
		}
		
		//Print the elements :
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		for(Entry<Integer,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate :"+entry.getKey()+" occured :"+entry.getValue());
			}
		}
	}
	
	
	
}
