package com.example.collegeapp.features.authentication.data

import javax.inject.Inject

class AuthenticationDataSource @Inject constructor() {

    /*
      TODO The following methods should be changed based on the APIs
    */

    fun isLogin(): Boolean {
        return true
    }

    fun login(username: String, password: String): Boolean {
        return true
    }

    fun register(userRegisterEntity: UserRegisterEntity): Boolean {
        return true
    }

}