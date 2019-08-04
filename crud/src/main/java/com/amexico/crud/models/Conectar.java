
package com.amexico.crud.models;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conectar {
 
    public DriverManagerDataSource conectar()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/prueba");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
        
    }
}
