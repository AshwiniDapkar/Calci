package array;

import java.util.ArrayList;

public class Proj_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> elements=new ArrayList<>();
elements.add(10);
elements.add(22);
elements.add(30);
elements.add(20);			
int sum=sumElements(elements);
System.out.println(sum);
	}
public static int sumElements(ArrayList<Integer> list)
{
	int sum=0;
	for(int i=0;i<list.size();i++) {
		sum+=list.get(i);
	}
	return sum ;
	
}
}