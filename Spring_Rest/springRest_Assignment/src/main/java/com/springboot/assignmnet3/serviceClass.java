package com.springboot.assignmnet3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class serviceClass {
	private static List<User_information> list=new ArrayList<>();
	static {
		list.add(new User_information("MAHARASHTRA","NAGPUR","INDIA",44001));
		list.add(new User_information("MYDHAPRADESH","JABALPUR","INDIA",44002));
	}
	public List<User_information> FindAll()
	{
		return list;
	}
	
	public User_information findByZip(int Zipcode)
	{
		return list.stream().filter(a->a.getZipcode()==Zipcode).findFirst().get();
	}
}
