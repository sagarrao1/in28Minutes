package com.in28minutes.rest.ws.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	// Static filtering
	@GetMapping(path = "/filtering")
	public SomeBean getAllrecords() {		
		
		SomeBean someBean=new SomeBean("Value 1","Value 2","Value 3");		
		return someBean;
	}
	
	@GetMapping(path = "/filtering-list")
	public List<SomeBean> getAllrecordsList() {		
		
		List<SomeBean> list= Arrays.asList(new SomeBean("Value 1","Value 2","Value 3"),
				new SomeBean("Value 31","Value 32","Value 33")	);		
		return list;
	}
	
	//Dynamic filtering
//	Filtering all except field1	and field2
	@GetMapping(path = "/dynamic/filtering")
	public MappingJacksonValue getAllrecordsDynamicExceptField1() {		
		ValueBean valueBean=new ValueBean("Value 1","Value 2","Value 3");
		
		SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");		
		FilterProvider filters = new SimpleFilterProvider().addFilter("ValueBeanFilter", filter);		
		MappingJacksonValue mapping= new MappingJacksonValue(valueBean);
		mapping.setFilters(filters);
		return mapping;
		
	}

//	Filtering all except field1 and field3
	@GetMapping(path = "/dynamic/filtering-list")
	public MappingJacksonValue getAllrecordsDynamicExceptField3() {		
		List<ValueBean> list= Arrays.asList(new ValueBean("Value 1","Value 2","Value 3"),
				new ValueBean("Value 31","Value 32","Value 33")	);	
		
		SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");		
		FilterProvider filters = new SimpleFilterProvider().addFilter("ValueBeanFilter", filter);		
		MappingJacksonValue mapping= new MappingJacksonValue(list);
		mapping.setFilters(filters);
		return mapping;
		
	}

	
	
}
