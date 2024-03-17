package hu.netsurf.warehouse.model

import hu.netsurf.warehouse.constants.TableSchemaConstants
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = TableSchemaConstants.SUPPLIERS_TABLE_NAME)
data class Supplier(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    var name: String = "",
)
