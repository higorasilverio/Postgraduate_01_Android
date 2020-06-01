package br.com.silverio.postgraduate_01

import java.io.Serializable
data class Product(var name: String, var description: String, var code: String, var price: Double) : Serializable