package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Contact;

import java.util.List;

public interface ContactService {
    public Contact addcontact(Contact c);
    public List<Contact> listContact();
    public void deleteContact (Contact c);
}
