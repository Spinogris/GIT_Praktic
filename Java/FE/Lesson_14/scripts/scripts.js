// const user = {
// с  в  о  й  с  т  в  о //
//   ключ      значение
    // userName: "John",
    // lastName: "Doe",
    // age: 35,
    // "car name": "bmw",
// }
// console.log(user);
// console.log(user.lastName);
// console.log(user.age);
// console.log(user.userName);
// console.log(user["car name"]);

// user.lastName = "Smith"
// user.profession = "deweloper"
// console.log(user);

//  =======================================================//

//   Создать объект с названием и ценой продукта и вывести данные в консоль.

// const product = {
//     name: "Macbook",
//     price: 4000
// }
// console.log(`product name: ${product.name}`);
// console.log(`product name: ${product.price}`);

//  =======================================================//

// Создать массив из объектов продуктов (свойства title, price, type) и, пройдясь циклом по массиву, сформировать строки. Вывести их в консоль.

const products = [
    {
        title: "Macbook",
        price: 4000,
        type: "Laptop",
    },
    {
        title: "Blander",
        price: 5056,
        type: "Kitchen",
    },
    {
        title: "Bacycle",
        price: 1500,
        type: "Sport",
    }
]
for(let i = 0; i < products.length; i++) {
    console.log(`Title of product: ${products[i].title}`);
    console.log(`Price of product: ${products[i].price}`);
    console.log(`Type of product: ${products[i].type}`);
    console.log(`---`);
}

const user = {
    'first name': 'John',
    lastName: 'Dow',
    profession: 'Programmer',
    salary: 4000,
    age: 30,
    active: true,
    address: {
        country: "Germany",
        city: "Berlin"
    }
}

// ==============  desctructurization  =================== //

const {salary, age, lastName} = user
console.log(salray)
console.log(salary);
console.log(active)