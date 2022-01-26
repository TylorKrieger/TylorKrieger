package com.krieger.contact;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet rs,int row) throws SQLException {
        Contact contact = new Contact();

        contact.setName(rs.getString("Name"));
        return contact;
    }
}
