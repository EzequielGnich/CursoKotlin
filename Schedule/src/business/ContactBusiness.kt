package business

import entity.ContactEntity
import repository.ContactRepository
import java.lang.Exception

class ContactBusiness {
    private fun validateSave(name: String, phone: String) {
        if (name == ""){
            throw Exception("Nome é obrigatório")
        }
        if (phone == "") {
            throw Exception("O telefone é obrigatório")
        }
    }

    private fun validateDelete(name: String, phone: String) {
        if (name == "" || phone == ""){
            throw Exception("Selecione um contato para excluir")
        }
    }

    fun getContactCountDescription(): String{
        val list = getContactList()
        return when {
            list.isEmpty() -> "0 contatos"
            list.size == 1 -> "1 contato"
            else -> "${list.size} contatos"
        }
    }

    fun saveContact(name: String, phone: String) {
        validateSave(name, phone)

        val contact = ContactEntity(name, phone)
        ContactRepository.saveContact(contact)
    }

    fun deleteContact(name: String, phone: String) {
        validateDelete(name, phone)

        val contact = ContactEntity(name, phone)
        ContactRepository.deleteContact(contact)
    }

    fun getContactList(): List<ContactEntity> {
        return ContactRepository.getContactList()
    }
}