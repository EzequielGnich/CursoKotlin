package business

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

    private fun saveContact(name: String, phone: String) {
        validateSave(name, phone)
    }

    private fun deleteContact(name: String, phone: String) {
        validateDelete(name, phone)
    }
}