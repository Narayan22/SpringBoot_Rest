package com.cignex.service;
import java.util.Hashtable;
import org.springframework.stereotype.Service;
import com.cignex.model.Person;


@Service
public class PersonService
{
	Hashtable<String, Person> persons  = new Hashtable<String ,Person>();
	public PersonService()
	{
		Person p = new Person();
		p.setId("1");
		p.setAge(22);
		p.setFirstName("narayan");
		p.setLastName("shah");
		persons.put("1", p);
		
		
		 p = new Person();
		p.setId("2");
		p.setAge(23);
		p.setFirstName("narayan");
		p.setLastName("bhadada");
		persons.put("2", p);
		
	}
	public Person gePerson(String id)
	{
		if(persons.containsKey(id))
			return persons.get(id);
		else
		{
			return null;
		}
	}
	public Hashtable<String , Person> getAll()
	{
		return persons;
		
	}

}
