package hu.netsurf.warehouse.model

import hu.netsurf.warehouse.constants.TableSchemaConstants
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = TableSchemaConstants.PRODUCTS_TABLE_NAME)
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    var name: String = "",

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    var supplier: Supplier = Supplier(),

    var price: Double = 0.0,

    var unit: String = "",

    var photo: String? = null,

    var onStock: Int = 0,
)
