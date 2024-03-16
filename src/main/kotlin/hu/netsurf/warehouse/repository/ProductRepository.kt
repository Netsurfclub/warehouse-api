package hu.netsurf.warehouse.repository

import hu.netsurf.warehouse.model.Product
import hu.netsurf.warehouse.model.Supplier
import org.springframework.stereotype.Repository

@Repository
class ProductRepository {

    fun getProducts(): List<Product> {
        // TODO: Clean up hard-coded data source after database set up.

        val supplier = Supplier(id = 1, name = "ACME Corp.")

        val product1 = Product(
            id = 1,
            name = "Product#1",
            supplier = supplier,
            price = 10.00,
            unit = "darab",
            photo = "1b500d90-345e-4570-aa39-7d9ad0f49bf0.jpg",
            onStock = 10,
        )

        val product2 = Product(
            id = 2,
            name = "Product#2",
            supplier = supplier,
            price = 20.00,
            unit = "darab",
            photo = "5aea2031-6e2c-4a21-8729-de882983ae37.png",
            onStock = 100,
        )

        val product3 = Product(
            id = 3,
            name = "Product#3",
            supplier = supplier,
            price = 50.00,
            unit = "darab",
            photo = "12ea3431-28b1-41ad-b80d-402a5bf46a4a.jpg",
            onStock = 1
        )

        return listOf(product1, product2, product3)
    }
}
