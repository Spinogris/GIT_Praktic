var addSectionBtn = document.getElementById("add-section-btn");
var sectionsContainer = document.getElementById("sections-container");

addSectionBtn.addEventListener("click", function() {
  var section = createSection("Новый раздел", "Описание раздела...");
  sectionsContainer.appendChild(section);
});

sectionsContainer.addEventListener("click", function(event) {
  var section = event.target.closest(".section");

  if (section) {
    var heading = section.querySelector("h2");
    var description = section.querySelector("p");

    var newHeading = prompt("Введите новый заголовок раздела:", heading.innerText);
    var newDescription = prompt("Введите новое описание раздела:", description.innerText);

    if (newHeading !== null && newDescription !== null) {
      heading.innerText = newHeading;
      description.innerText = newDescription;
    }
  }
});

function createSection(title, description) {
  var section = document.createElement("div");
  section.className = "section";

  var heading = document.createElement("h2");
  heading.innerText = title;

  var desc = document.createElement("p");
  desc.innerText = description;

  var deleteButton = document.createElement("button");
  deleteButton.textContent = "Удалить";
  deleteButton.addEventListener("click", function() {
    section.remove(); // Удаляем раздел при клике на кнопку удаления
  });

  var editButton = document.createElement("button");
  editButton.textContent = "Редактировать";

  section.appendChild(heading);
  section.appendChild(desc);
  section.appendChild(deleteButton);
  section.appendChild(editButton);

  return section;
}
