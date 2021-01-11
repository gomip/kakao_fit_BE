package com.example.springbase.model.entity.test

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * 21.01.11 | gomip | created
 */

@Entity
@Table(name = "test_mst")
data class TestMst (
    @Id
    var id: String? = "",
    var value: String? = ""
)