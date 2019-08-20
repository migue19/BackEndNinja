package mx.com.nut.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import mx.com.nut.backendninja.model.Person;
import mx.com.nut.backendninja.service.ExampleService;


@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
	private static final Log LOGGER = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("migue", 12));
		people.add(new Person("pedro", 13));
		people.add(new Person("juan", 14));
		people.add(new Person("memo", 15));
		LOGGER.info("HELLO FROM SERVICE");
		return people;	
	}

}
