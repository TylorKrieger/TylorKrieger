package com.krieger.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ContactDaoImpl implements ContactDao {

    private static final String DELETE_CONTACT_BY_CONTACT_ID = "update CONTACT set IS_DELETED = 'Y' where ? = CONTACT_ID";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional
    public int deleteContactByContactId(int contactId) {
        try {
            this.jdbcTemplate.update(DELETE_CONTACT_BY_CONTACT_ID, contactId);
            return 1;
        } catch (Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }
}
