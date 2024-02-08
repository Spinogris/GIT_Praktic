// const usernameInput = document.querySelector(".username_input")
// const btn = document.querySelector("button")
// usernameInput.value = "Hello"
// btn.addEventListener("click", function () {
//     console.log(usernameInput.value) // значение исчезнет из консоли через ~1мс из-за обновления страницы 
// })

// Создать форму, при submit которой данные из формы выводятся в консоль.
// const usernameInput = document.querySelector(".username_input")
// const formElem = document.querySelector("form")
// formElem.addEventListener("submit", function(event) {
//     event.preventDefault()
//     console.log(usernameInput.value)
// })

// =============== tasks ===============

// 1. Создать форму в html (наименование товара и цена) и добавить скрипт, чтобы при отправке формы данные из нее выводились в консоль.
// 2. Доработать процесс таким образом, чтобы при отправке формы данные из нее добавлялись в массив с продуктами в виде объекта.
// {
//     name: "Notebook",
//     price: 4500
// }
const formElem = document.querySelector("#product_form")
const productNameInp = document.querySelector(".product_name")
const productPriceInp = document.querySelector(".product_price")
let products = []
formElem.addEventListener("submit", function (event) {
    event.preventDefault()
    // console.log(productNameInp.value)
    // console.log(productPriceInp.value)
    const productObject = {
        name: productNameInp.value,
        price: +productPriceInp.value
    }
    products.push(productObject)
    rerender()

    formElem.reset()
    productNameInp.focus()
})

// 3. Добавить функцию, которая получает наименование карточки и цену и возвращает HTML элемент с карточкой товара.
function createProductCard(name, price) {
    const divElem = document.createElement("div")
    divElem.classList.add("product-item")
    const pName = document.createElement("p")
    pName.innerText = name
    const pPrice = document.createElement("p")
    pPrice.innerText = price
    divElem.append(pName, pPrice)

    return divElem
}
// 4. Разработать функцию rerender. Эта функция очищает контейнер с карточками и создает множество карточек с товарами из массива. Настроить rerender при добавлении нового продукта.
// {
//     name: "Notebook",
//     price: 4500
// }
// 5. Доработать rerender таким образом, чтобы при двойном клике по карточке в консоль выводилось название товар.
// dblclick
const productsContainer = document.querySelector(".products_container")
function rerender() {
    productsContainer.innerHTML = ""
    if (products.length === 0) {
        const h1Elem = document.createElement("h1")
        h1Elem.innerText = "Товаров нет"
        productsContainer.append(h1Elem)
        return
    }
    for (let i = 0; i < products.length; i++) {
        const {name, price} = products[i]
        const productElem = createProductCard(name, price)
        const removeBtn = createRemoveBtn()
        productElem.append(removeBtn)
        removeBtn.addEventListener("click", function () {
            console.log(i)
            products.splice(i, 1)
            // первое значение = индекс с которого надо начать удаление
            // второе значение = количество элементов которые надо удалить
            rerender()
            // productElem.remove()
        })
        productElem.addEventListener("dblclick", function () {
            console.log(name)
        })
        productsContainer.append(productElem)
    }
}

// 6. Добавить функцию, которая возвращает кнопку в виде крестика в красном кружке.
// createRemoveBtn
// <div class="remove">X</div>
function createRemoveBtn() {
    const divElem = document.createElement("div") // <div></div>
    divElem.classList.add("remove") // <div class="remove"></div>
    divElem.innerText = "X" // <div class="remove">X</div>
    return divElem
}
// 7. Добавить в rerender добавление крестика в верхнем правом углу карточки товара.
// 9. Добавить отображение фразы “товаров нет”, когда товаров нет.
// 10. Добавить форму в HTML с полем ввода и кнопкой для поиска по товарам. Реализовать скрипт, который получает из формы строку при submit и выводит в консоль.
const filtersForm = document.querySelector("#products_filters_form")
const searchText = document.querySelector(".product_search_text")
const sortField = document.querySelector("#product_sort")
filtersForm.addEventListener("change", function(event) {
    event.preventDefault()
    console.log(searchText.value)
    console.log(sortField.value)
    if(sortField.value === "name") {
        products = products.sort(function(a, b) { // a = i, b = i + 1
            if (a.name === b.name) {
                return 0
            } else if (a.name > b.name) {
                return 1
            } else if (a.name < b.name) {
                return -1
            }
        })
        rerender()
    } else if (sortField.value === "price") {
        products = products.sort(function(a, b) { // a = i, b = i + 1
            if (a.price === b.price) {
                return 0
            } else if (a.price > b.price) {
                return 1
            } else if (a.price < b.price) {
                return -1
            }
        })
        rerender()
    } if (searchText.value !== "") {
        products = products.filter(function(productObject) {
            return productObject.name.startsWith(searchText.value)
        })
        rerender()
    }
})

// 11. Меняем вызов обработчика формы с submit на change и убираем кнопку из формы.
// 12. Сделать сортировку товаров по названию по нажатию по кнопке.
// 13. Сделать сортировку товаров по цене по нажатию на кнопку.