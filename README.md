# Click-Play
Webproject, webshop
The goal of the project is to develop a webshop. It shall contain a
frontend in HTML/Javascript/CSS, a backend in JavaServer Faces
running on a Wildfly server, and a MySQL database.

#Requirements
The system shall have two major modes: Customer mode and
Administrator Mode. The requirements for each mode as well as some
general requirements are listed below.

General requirements:
* The webshop shall contain any number of products.
* All information about the products shall be stored in the
database.
* Each product shall have the following information:
 * Name: name of the product
 * Category: the category the product belongs to
 * Quantity: availability of the product
 * Price: price of the product
 * Description: A text describing the product
 * Image: An image of the product
* The products shall be grouped into a number of pre-defined
categories (for example games, keyboards, earphones, ...).

Customer mode requirements:
* The customer shall be able to browse the products in the
following ways:
 * Show all available products
 * Search for a product
 * Show products in a selected category
* It shall be possible to click on a product to see more details
about it.
* The customer shall be able to put a product in a Shopping
Basket.
* The customer shall be able to view the products in the
Shopping Basket.
* It shall be possible to change the quantity of a product in the
* Shopping Basket, or remove a product.
* The customer shall be able to place an order.
* When placing an order, a form shall be shown where the
customer enters his/her contact details (email, address, phone
number).
* When an order is finalized the customer shall receive an auto-
generated order number.
* The customer shall be able to check the status of his/her order
from the order number.

Administrator mode requirements:
* The webshop shall have an Admin system where an
administrator can log in.
* User accounts and passwords shall be stored in the database.
* When a customer places an order, the order shall be added to
the database and the quantity of the ordered products shall be
updated in the webshop.
* In the Admin system it shall be possible to:
 * Add a new product
 * Remove a product
 * Change information about a product
 * Manage deliveries (i.e. update the quantity of items)
 * Add a new administrator account
 * Remove an administrator account
 * Add a new product category
 * View all orders
 * Update an order
* Each order shall have a status: New, Delayed or Shipped.
* An administrator updates the order status manually.

It is up to the project group to design the Graphical User Interface. If
any functional requirement about the system is missing, it is up to the
project group to add additional requirements.

Documentation
The following documents shall be produced during the project:
- Analysis document with the requirements for the application and
sketches of the webpage layout. Each requirement shall have a
description and an assigned unique ID number as shown below.
