package hu.netsurf.warehouse.model

data class Product(
    val id: Int,
    val name: String,
    val supplier: Supplier,
    val price: Double,
    val unit: String,
    val photo: String?,
    val onStock: Int,
)
