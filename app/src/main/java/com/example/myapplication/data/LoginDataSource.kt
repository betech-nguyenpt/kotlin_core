package com.example.myapplication.data

import com.example.myapplication.data.model.LoggedInUser
import java.io.IOException

class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            val User = LoggedInUser(java.util.UUID.randomUUID().toString(), "Pham Quang Trung")
            if (username == "trung123456" && password == "123456") {
                return Result.Success(User)
            } else {
                return Result.Error(IOException("Username or password wrong"))
            }
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }
    fun logout() {

    }
}