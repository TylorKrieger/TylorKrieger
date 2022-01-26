package com.krieger.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    @Autowired
    private ContactServiceInterface contactServiceInterface;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/api/contact", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createContact(@RequestBody Contact contact) {
        contactServiceInterface.createContact(contact);
                return new ResponseEntity(HttpStatus.OK);
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/api/contact/{contactId}", method = RequestMethod.DELETE)
    public ResponseEntity deleteContactByContactId(@PathVariable int contactId) {
        int result = contactServiceInterface.deleteContactByContactId(contactId);
        if (result == 1){
            return new ResponseEntity(HttpStatus.OK);
        }else if(result == 0){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
