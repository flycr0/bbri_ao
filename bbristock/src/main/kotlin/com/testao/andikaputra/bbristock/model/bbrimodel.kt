package com.testao.andikaputra.bbristock.model
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/*
Primary Key :bidprice, offerprice

Relation : Many To Many (to match between bid and offer price for buy/sell action)
*/
@Entity
@Table(name = "bbribid")
data class bbribid(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long=0,
        val bidprice: Int,
        val bidlot: Int,
        val bidorder: Int
)
@Entity
@Table(name = "bbrioffer")
data class bbrioffer(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long=0,
        val offerprice: Int,
        val offerlot: Int,
        val offerorder: Int
)