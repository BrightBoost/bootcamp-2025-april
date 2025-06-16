package com.example.firstapp.dao;

import com.example.firstapp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDao {

    private DataSource dataSource;

    @Autowired
    public CustomerDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Customer> getAllCustomers() {
        String query = "SELECT * FROM customer";
        List<Customer> customers = new ArrayList<>();
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            while(resultSet.next()) {
                Customer customer = new Customer(resultSet.getInt("customer_id"), resultSet.getInt("store_id"), resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getString("email"), resultSet.getInt("address_id"), resultSet.getBoolean("active"));
                customers.add(customer);
            }
        } catch(SQLException e) {
            System.out.println("Oh dear: " + e.getMessage());
        }
        return customers;
    }

    public Customer getCustomerById(int id) {
        String query = "SELECT * FROM customer WHERE customer_id = ?";
        Customer customer = null;
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, id);
            try(ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                     customer = new Customer(resultSet.getInt("customer_id"), resultSet.getInt("store_id"), resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getString("email"), resultSet.getInt("address_id"), resultSet.getBoolean("active"));
                }
            }
        } catch(SQLException e) {
            System.out.println("Oh dear: " + e.getMessage());
        }
        return customer;
    }

    // add new customer
    public Customer addCustomer(Customer customer) {
        String query = "INSERT INTO customer(store_id, first_name, last_name, email, address_id, active) VALUES (?,?,?,?,?,?)";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ) {
            preparedStatement.setInt(1, customer.getStoreId());
            preparedStatement.setString(2, customer.getFirstName());
            preparedStatement.setString(3, customer.getLastName());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setInt(5, customer.getAddressId());
            preparedStatement.setBoolean(6, customer.isActive());
            preparedStatement.executeUpdate();
            try(ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                resultSet.next();
                customer.setId(resultSet.getInt(1));
            }
        } catch(SQLException e) {
            System.out.println("Oh dear: " + e.getMessage());
        }
        return customer;
    }
}
