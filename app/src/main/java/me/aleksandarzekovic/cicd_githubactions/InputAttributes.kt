package me.aleksandarzekovic.cicd_githubactions

class InputAttributes{

    fun getFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }
}