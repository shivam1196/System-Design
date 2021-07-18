package com.shivam.urlshortner.service

import com.shivam.urlshortner.model.UserDetails

interface UserDetailsService {

    fun addUserDetails(userDetails: UserDetails) : String
    fun getUserDetails() : UserDetails

}