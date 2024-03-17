package hu.netsurf.warehouse.model

import hu.netsurf.warehouse.constants.TableSchemaConstants.SUPPLIERS_TABLE_NAME
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = SUPPLIERS_TABLE_NAME)
data class Supplier(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    var name: String = "",
)
