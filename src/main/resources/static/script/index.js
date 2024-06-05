
const menuElement = document.querySelector('.menu');
const linksElement = document.querySelector('.links');

menuElement.addEventListener('click', openNav);

function openNav(e) {
    document.body.style.overflowY = 'hidden';
    linksElement.classList.toggle('show');
    if(linksElement.getAttribute('class') == 'links') {
        document.body.style.overflow = 'auto';
    }
}

console.log(linksElement.getAttribute('class'));

// Seleccionar todos los botones "Agregar al Carrito"
const addToCartButtons = document.querySelectorAll('.add-to-cart-btn');

// Función para agregar un producto al carrito
function addToCart(name, price) {
    let cart = JSON.parse(localStorage.getItem('cart')) || [];
    cart.push({ name, price });
    localStorage.setItem('cart', JSON.stringify(cart));
}

// Agregar un listener a cada botón "Agregar al Carrito"
addToCartButtons.forEach(button => {
    button.addEventListener('click', () => {
        const productName = button.getAttribute('data-name');
        const productPrice = button.getAttribute('data-price');
        addToCart(productName, productPrice);
        alert(`${productName} agregado al carrito`);
    });
});


