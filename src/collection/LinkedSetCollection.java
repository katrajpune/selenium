package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedSetCollection {
private static final int LinkedList = 0;

public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("velocity");
	al.add("corporation");
	al.add("velocity");
	al.add("group");
	
	//LinkedHashSet<String> lkh = new LinkedHashSet<String>(al);
	//System.out.println(lkh);
	
//HashSet<String> lkh1 = new HashSet<String>(al);
	//System.out.println(lkh1);
	
	LinkedList<String> lkh2 = new LinkedList<String>(al);
	System.out.println(lkh2);
	
	
	
}
}
