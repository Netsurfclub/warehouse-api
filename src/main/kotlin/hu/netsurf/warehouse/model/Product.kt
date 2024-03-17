package hu.netsurf.warehouse.model

import hu.netsurf.warehouse.constants.TableSchemaConstants.PRODUCTS_TABLE_NAME
import hu.netsurf.warehouse.constants.TableSchemaConstants.SUPPLIER_ID_JOIN_COLUMN_NAME
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = PRODUCTS_TABLE_NAME)
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    var name: String = "",

    @ManyToOne
    @JoinColumn(name = SUPPLIER_ID_JOIN_COLUMN_NAME)
    var supplier: Supplier = Supplier(),

    var price: Double = 0.0,

    var unit: String = "",

    var photo: String? = null,

    var onStock: Int = 0,
)
