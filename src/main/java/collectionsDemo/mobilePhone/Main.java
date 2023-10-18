package collectionsDemo.mobilePhone;

import collectionsDemo.mobilePhone.Contact;
import collectionsDemo.mobilePhone.MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("208568");
        Contact contact1 = new Contact("Alena", "123456");
        Contact contact2 = new Contact("Blala", "3456");
        Contact contact3 = new Contact("Carar", "98767");
        Contact contact4 = new Contact("Carar", "98767");
        Contact contact5 = new Contact("Dada", "98767");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.printContacts();
        System.out.println(mobilePhone.addNewContact(contact2));
        System.out.println(mobilePhone.addNewContact(contact5));



    }
}
