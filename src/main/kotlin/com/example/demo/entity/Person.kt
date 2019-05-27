package com.example.demo.entity

import javax.persistence.*

@Entity
data class Person (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    val firstName: String,

    val lastName: String
)