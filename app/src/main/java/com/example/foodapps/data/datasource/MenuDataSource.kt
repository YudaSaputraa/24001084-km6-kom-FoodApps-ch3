package com.example.foodapps.data.datasource

import com.example.foodapp.model.Menu
import com.example.foodapps.R

interface MenuDataSource {
    fun getMenuData(): List<Menu>
}

class MenuDataSourceImpl() : MenuDataSource {
    override fun getMenuData(): List<Menu> {
        return mutableListOf(
            Menu(
                image = R.drawable.img_frenchfries_menu,
                name = "Kentang Goreng",
                price = 15000.0,
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77",
                locationAddress = "Jl. BSD Green Office Park, Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tanggerang, Banten 15345",
                desc = "Kentang goreng yang renyah di luar dan lembut di dalam.",

                ),
            Menu(
                image = R.drawable.img_friedrice_menu,
                name = "Nasi Goreng",
                price = 30000.0,
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77",
                locationAddress = "Jl. BSD Green Office Park, Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tanggerang, Banten 15345",
                desc = "Nasi goreng spesial dengan bumbu yang khas dan cita rasa yang lezat."
            ),
            Menu(
                image = R.drawable.img_noodle_menu,
                name = "Mie Kuah Spesial",
                price = 25000.0,
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77",
                locationAddress = "Jl. BSD Green Office Park, Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tanggerang, Banten 15345",
                desc = "Mie kuah dengan campuran bahan-bahan pilihan dan kuah yang gurih."
            ),
            Menu(
                image = R.drawable.img_lime_mojito_menu,
                name = "Lime Mojito",
                price = 20000.0,
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77",
                locationAddress = "Jl. BSD Green Office Park, Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tanggerang, Banten 15345",
                desc = "Minuman segar dengan perpaduan jeruk nipis, mint, dan soda."
            ),
            Menu(
                image = R.drawable.img_salad_menu,
                name = "Salad",
                price = 23000.0,
                locationUrl = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77",
                locationAddress = "Jl. BSD Green Office Park, Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tanggerang, Banten 15345",
                desc = "Salad segar dengan berbagai macam sayuran dan dressing yang lezat."
            ),
        )
    }

}