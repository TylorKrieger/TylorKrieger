package com.krieger.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactServiceInterface {
    @Autowired
    private ContactDao contactDao;

    @Override
    public void createContact(Contact contact){
        if(contact.getContactId() == null || contact.getContactId().isEmpty()
        ){
            throw new IllegalArgumentException("ContractId cannot be null");
        }
    }

    @Override
    public int deleteContactByContactId(int contactId) {
        return contactDao.deleteContactByContactId(contactId);
    }
}
