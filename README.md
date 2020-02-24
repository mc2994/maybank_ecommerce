# Maybank Ecommerce

# Activity Diagram

![alt text](https://github.com/mc2994/maybank_ecommerce/blob/master/Activity%20Diagram.jpg)


# Class Diagram

![alt text](https://github.com/mc2994/maybank_ecommerce/blob/master/maybank%20erd.png)

# How to run the application.

1. Copy the exam.war file from "maybank war file" folder
2. Deploy to JBoss EAP 7.1 
3. Open postman, try to access this url without authentication

[GET METHOD]

Get All Products:
        localhost:8080/exam/products/

Search for a product:
       localhost:8080/exam/products/{productName}       


4. Access url with Authentication 
       username: mckinley
       password: mckinley

[POST METHOD]
Add Product:
        localhost:8080/exam/products/

[PUT METHOD]
Update a product:
       localhost:8080/exam/products/

[DELETE METHOD]
      localhost:8080/exam/products/{productId}

# sample data:

 {
		
        "url": "http://www.lifestylelabels.com/womens-golf-shoes.htm",
        "title": "hello world --zzzz---",
        "price": 111,
        "msrp": 444,
        "isAvailable": 1,
        "description": "Sporting with style, this is a durable and super-comfortable golf shoe built for performance.",
        "imageUrl": "http://www.lifestylelabels.com/media/catalog/product/cache/1/small_image/210x/9df78eab33525d08d6e5fb8d27136e95/n/i/nine-west-women-s-lucero-pump.jpg",
        "category": {
            "categoryId": 2,
            "categoryName": "For Women"
        },
        "merchant": {
            "merchantId": 2,
            "merchantName": "Ecco"
        },
        "subCategory": {
            "subCategoryId": 2,
            "name": "Shoes"
        }
 }







