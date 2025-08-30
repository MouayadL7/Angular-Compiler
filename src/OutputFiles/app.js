class ProductService {
constructor() {
this.productsSubject = [
{
id: 1,
name: 'Dell XPS 13 Laptop',
price: 1299,
image: 'https://images.unsplash.com/photo-1496181133206-80ce9b88a853?w=400',
description: 'High-performance laptop with Intel Core i7 processor and 16GB RAM',
}, 
{
id: 2,
name: 'iPhone 15 Pro',
price: 999,
image: 'https://images.unsplash.com/photo-1592750475338-74b7b21085ab?w=400',
description: 'Latest iPhone release with advanced camera and exceptional performance',
}, 
{
id: 3,
name: 'AirPods Pro',
price: 249,
image: 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=400',
description: 'Wireless earbuds with active noise cancellation',
}
];
this.products = this.productsSubject.asObservable();

}
getProducts() {
return this.products;
}

getProduct(id) {
return this.productsSubject.value.find(p  => p.id === id);
}

addProduct(product) {
const products = this.productsSubject.value;
const newProduct = 
{
product,
id: Math.max(0, ...products.map(p  => p.id)),
};
this.productsSubject.next([...products, newProduct
]);
}

updateProduct(id, product) {
const products = this.productsSubject.value;
const index = products.findIndex(p  => p.id === id);
}

deleteProduct(id) {
const products = this.productsSubject.value.filter(p  => p.id !== id);
}

}


class ProductListComponent {
constructor() {
this.searchTerm = '';
;
;

}
ngOnInit() {
this.products = this.productService.getProducts();
}

updateFilteredProducts() {
this.filteredProducts = this.products.pipe(map(products  => products.filter(product  => product.name.toLowerCase())));
}

navigateToProductDetails(id) {
this.router.navigate(['/products', id
]);
}

navigateToAddProduct() {
this.router.navigate(['/products/new'
]);
}

}


class ProductDetailComponent {
constructor() {
;

}
ngOnInit() {
const id = Number(this.route.snapshot.params['id'
]);
}

navigateToProductsList() {
this.router.navigate(['/products'
]);
}

navigateToEditProduct() {
}

deleteProduct() {
}

}


class ProductFormComponent {
constructor() {
this.isEditing = false;
this.productId = null;
this.formData = 
{
name: '',
price: 0,
image: '',
description: '',
};

}
ngOnInit() {
const id = this.route.snapshot.params['id'
];
}

saveProduct() {
this.router.navigate(['/products'
]);
}

navigateToProductsList() {
this.router.navigate(['/products'
]);
}

}


class AppComponent {
constructor() {
this.title = 'products-app';

}
}


