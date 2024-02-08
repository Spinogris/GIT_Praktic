// const user_container = document.querySelector(".user_container");

// const users = [
//   { name: "Vazgen", age: 23, lastName: "Dabtyan" },
//   { name: "Yuri", age: 12, lastName: "Niulin" },
//   { name: "Maria", age: 32, lastName: "Ardova" },
//   { name: "Nikolay", age: 12, lastName: "Sidorov" },
//   { name: "Alexandr", age: 29, lastName: "Grishko" },
// ];

// const renderUsers = (eachUser) => {
//   const div = document.createElement("div");

//   const nameParagraph = document.createElement("p");
//   nameParagraph.textContent = `User full name: ${eachUser.name} ${eachUser.lastName}`;

//   const ageParagraph = document.createElement("p");
//   ageParagraph.textContent = `User age is: ${eachUser.age}`;

//   div.classList = "eachUser";
//   div.append(nameParagraph, ageParagraph);
//   user_container.append(div);
// };

// for (let index = 0; index < users.length; index++) {
//   if (users[index].age >= 18) {
//     renderUsers(users[index]);
//   }
// }


// обращяюсь к контейенру чтобы мой новазборазованный элемент поместить внего
const user_container = document.querySelector(".user_container");
// создаю переменную для того чтобы хранить в дальнешйем наш новый html кусок кода(в конце сделать консоль)
let usersHTML = "";

const users = [
  { name: "Vazgen", age: 23, lastName: "Dabtyan" },
  { name: "Yuri", age: 12, lastName: "Niulin" },
  { name: "Maria", age: 32, lastName: "Ardova" },
  { name: "Nikolay", age: 12, lastName: "Sidorov" },
  { name: "Alexandr", age: 29, lastName: "Grishko" },
];

// мы создаем массив где будем хранить отфильтрованных пользователей исходя из условия
const filteredUsers = [];

// итериуемся по массиву
for (let index = 0; index < users.length; index++) {
  // для нашего удобство храним значения возраста пользователя в новой переменной
  const userAge = users[index].age;
  // ставим условие если возраст итерируемого пользовтелья больше или равен 18
  // то в массив filteredUsers добавь этого пользователья
  if (userAge >= 18) {
    filteredUsers.push(users[index]);
  }
}

// после того как добавили в отфильторавнный массив пользоватлеей делаем итерация
// И вовремя каждой итерации создаем новый кусок html кода
filteredUsers.forEach((eachUser) => {
  // usersHTML переменная во время каждой итерации прибавляет к себе ее предыдущее состояние и новый html код в  виде строки
  usersHTML += `
  <div class="eachUser">
    <p>User fullName: ${eachUser.name} ${eachUser.lastName}</p>
    <p>User age: ${eachUser.age}</p>
  </div>`;
});

// Когда наша переменная usersHTML получила весь набор html кода то мы ее добавляем в контейнер "user_container"
user_container.insertAdjacentHTML("afterbegin", usersHTML);