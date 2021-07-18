package com.shivam.urlshortner.service

import com.shivam.urlshortner.model.UserDetails
import java.math.BigInteger
import java.security.MessageDigest

class UserDetailsServiceImpl : UserDetailsService{
    override fun addUserDetails(userDetails: UserDetails): String {
        val userDetailsForHash: String = userDetails.getUserDetailsForHash()
        val apiHash : String = generateHashFunctionForString(userDetailsForHash)





    }

    override fun getUserDetails(): UserDetails {

    }

    private fun generateHashFunctionForString(userDetails: String) : String {
        val messageDigest = MessageDigest.getInstance("MD5")

        val messageBytes = messageDigest.digest(userDetails.toByteArray(Charsets.UTF_8))

        val bigInteger = BigInteger(1,messageBytes)

        var hashtext = bigInteger.toString(16)

        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext
        }
        return hashtext;
    }
}