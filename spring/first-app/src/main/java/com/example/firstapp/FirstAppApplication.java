package com.example.firstapp;

import com.example.firstapp.configuration.DatabaseConfiguration;
import com.example.firstapp.controller.CityController;
import com.example.firstapp.controller.CustomerController;
import com.example.firstapp.dao.CityDao;
import com.example.firstapp.dao.CustomerDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		// this is what the spring container / gnome paulo does
		// look for classes and methods that will be beans
		// databaseconfig, getDataSource, citycontroller, customercontroller
		// languagecontroller, citydao, customerdao, languagedoa
		// firstappapplication
//		DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();
//		DataSource getDataSource = databaseConfiguration.getDataSource();
//		CityDao cityDao = new CityDao(getDataSource);
//		CityController controller = new CityController(cityDao);
//		CustomerDao customerDao = new CustomerDao(getDataSource);
//		CustomerController customerController = new CustomerController(customerDao);
		// and so on

		ApplicationContext ac = SpringApplication.run(FirstAppApplication.class, args);
//		for(String beanName : ac.getBeanDefinitionNames()) {
//			System.out.println(beanName);
//		}

		Example example = ac.getBean(Example.class);
		System.out.println(example.getTest());
	}

}
