package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "5533b090-b95e-11ef-bd75-910c78c6f893",
        categoryId = "5533b091-b95e-11ef-bd75-910c78c6f893",
        name = "Sabor Grill",
        description = "Churrascaria com corte nobres e buffer variado. Experiência completa para os amantes de carne.",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.12345678910,
        longitude = -46.12345678910,
        address = "Av. Paulista - Bela vista",
        phone = "(11) 94567- 1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "a23e5d40-c89f-11ef-a3c2-374d78c6f893",
        categoryId = "a23e5d41-c89f-11ef-a3c2-374d78c6f893",
        name = "Café Aroma",
        description = "Cafeteria aconchegante com uma seleção especial de grãos e quitutes artesanais.",
        coupons = 5,
        rules = emptyList(),
        latitude = -22.98765432110,
        longitude = -47.98765432110,
        address = "Rua das Flores, 123 - Centro",
        phone = "(11) 99876-5432",
        cover = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=400&h=300"
    )
)