package com.example.walmartstore.data

import com.example.walmartstore.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            if (username == "fake" && password == "fake") {
                val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "FakeCust")
                return Result.Success(fakeUser)
            }
            else {
                return Result.Error(IOException("Wrong user", e))
            }
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}