package com.shivam.urlshortner.model

import lombok.Builder
import org.springframework.data.mongodb.core.mapping.Document

@Document
@Builder
data class DevApiKey(val userName:String, val hashApiDevKey : String)