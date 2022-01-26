package com.krieger.contact;

import java.util.Optional;

public interface ContactServiceInterface {
    void createContact (Contact contact);

    int deleteContactByContactId(int contactId);
}
