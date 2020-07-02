package com.brainbyte.healthareana.util.user

import com.brainbyte.healthareana.data.model.User
import com.brainbyte.healthareana.data.model.Result
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.firebase.auth.FirebaseAuth
import timber.log.Timber
import javax.inject.Inject

class UserDataRepository @Inject constructor (
    private val userManager: UserManager
) {

    suspend fun loginInUser(auth: FirebaseAuth, account: GoogleSignInAccount): Result<User> {
        Timber.d("In User Data Repository")
        return userManager.loginUser(auth, account)
    }

}