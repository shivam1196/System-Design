package com.shivam.urlshortner.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class UserDetails(val firstName:String, val lastName: String, @Indexed(unique = true) val userName:String, val passWord:String)