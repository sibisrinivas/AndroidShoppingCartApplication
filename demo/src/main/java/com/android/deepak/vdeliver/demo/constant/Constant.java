package com.android.deepak.vdeliver.demo.constant;

import com.android.deepak.vdeliver.demo.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Vegetable Samosa", BigDecimal.valueOf(9.99), "A samosa (/səˈmoʊsə/) or samoosa is a fried or baked pastry with a savoury filling, such as spiced potatoes, onions, peas.");
    public static final Product PRODUCT2 = new Product(2, "Upma Pesarattu", BigDecimal.valueOf(7.25), "Upma or Uppuma or Uppittu is a common South Indian and Sri Lankan Tamil breakfast dish, cooked as a thick porridge from dry roasted semolina or coarse rice flour.");
    public static final Product PRODUCT3 = new Product(3, "Saag Paneer", BigDecimal.valueOf(12.25), "Saag paneer is a classic Indian dish of cooked spinach studded with cubes of fried paneer cheese. Thickened with cream or coconut milk, it's a hearty and filling vegetarian meal");
    public static final Product PRODUCT4 = new Product(4, "Chicken Tikka Masala", BigDecimal.valueOf(13.00), "Chicken tikka masala is a dish of roasted chunks of chicken tikka in a spicy sauce. The sauce is usually creamy, spiced and orange-coloured.");
    public static final Product PRODUCT5 = new Product(5, "Chicken Vindaloo", BigDecimal.valueOf(13.25), "Vindaloo (also known as vindallo, vindalho, or vindaalo) is an Indian curry dish popular in the region of Goa, the surrounding Konkan, and many other parts of India");
    public static final Product PRODUCT6 = new Product(6, "Pani Puri", BigDecimal.valueOf(4.25), "Potato, onion, chickpeas, coriander chutney stuffed crispy puri drenched in sour and spicy mint flavored water (pudina pani) easily fills one’s mouth and takes taste buds on a journey of heaven");
    public static final Product PRODUCT7 = new Product(7, "Sev Puri", BigDecimal.valueOf(5.25), "Sevpuri, as the name indicates is sev topped on puris or papdis, along with potatoes and chutneys. Tangy, crisp and tongue tickling are some words that come to my mind when I think of sevpuri.");
    public static final Product PRODUCT8 = new Product(8, "Channa Battura", BigDecimal.valueOf(11.25), "Chole bhature is a combination of chole and fried Indian bread. Chole is prepared with chick peas and bhatoora is a fried Indian bread made of all purpose flour/maida");
    public static final Product PRODUCT9 = new Product(9, "Dahi Puri", BigDecimal.valueOf(10.25), "The round, hard, puffy puri shell is first broken on top and partially filled with the main stuffing of mashed potatoes or chickpeas. A small amount of haldi powder or chilli powder, or both, may be added for taste, as well as a pinch of salt.");
    public static final Product PRODUCT10 = new Product(10, "Paratta", BigDecimal.valueOf(9.75), "A paratha is a flatbread that originated in the north of the Indian Subcontinent. It is still quite prevalent in the north of India, where wheat is grown and is the traditional staple of the area. ");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
        PRODUCT_LIST.add(PRODUCT4);
        PRODUCT_LIST.add(PRODUCT5);
        PRODUCT_LIST.add(PRODUCT6);
        PRODUCT_LIST.add(PRODUCT7);
        PRODUCT_LIST.add(PRODUCT8);
        PRODUCT_LIST.add(PRODUCT9);
        PRODUCT_LIST.add(PRODUCT10);
    }
}
