package com.news.jetpackcomposenavigation

import android.util.Log
import javax.inject.Inject

const val TAG="Prandroid HILT"

interface  UserRepository{
    fun saveUser(email:String,password:String){}
}
class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email:String,password:String){
        Log.d(TAG,"USER saved in db")

    }
}
class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"USER saved in Firebase")
    }
}