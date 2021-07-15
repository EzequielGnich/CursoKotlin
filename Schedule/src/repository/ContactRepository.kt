package repository

import entity.ContactEntity

class ContactRepository {
    companion object {
        private val contactList = mutableListOf<ContactEntity>()

        fun saveContact(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun deleteContact(contact: ContactEntity) {

        }

        fun getContactList(): List<ContactEntity> {
            return contactList
        }

    }
}