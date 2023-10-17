package mobilePhone;

import java.util.ArrayList;
import java.util.List;

//Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
//    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
//    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
//    -  And seven methods, they are (their functions are in their names):
//        -  addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
//        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
//        -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
//        -  findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
//        -  findContact(), same as above, only it has one parameter of type String.
//        -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
//        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
//Contact List:
//1. Bob -> 31415926
//2. Alice -> 16180339
//3. Tom -> 11235813
//4. Jane -> 23571113
//TIP:  In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.
//TIP:  Two Contact objects are equal if they have the same name.
//TIP:  Be extremely careful about spaces in the printed message.
public class MobilePhone {
    private String myNumber;
    private static List<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    private static int findContact(Contact contact) {
            return myContacts.indexOf(contact);
    }
    private static int findContact(String name) {
        for (Contact contact: myContacts) {
            if (contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact newContact) {
        if (MobilePhone.findContact(newContact) != -1) {
            return false;
        }
        myContacts.add(newContact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (MobilePhone.findContact(newContact) != -1) {
            int contactIndex = myContacts.indexOf(oldContact);
            myContacts.set(contactIndex, newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact) {
        if (MobilePhone.findContact(contact) != -1) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public Contact queryContact(String name) {
        for (Contact contact: myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void  printContacts() {
        System.out.println("Contact List:");
        int count = 1;
        for (Contact contact: myContacts) {
            System.out.printf("%d. %s -> %s%n", count, contact.getName(), contact.getPhoneNumber());
            count ++;
        }
    }
}
