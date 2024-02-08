package org.example._23_09_27;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class TaskManager {

  private List<Task> taskList;                // Список всех задач.
  private List<Developer> developerList;      // Список всех разработчиков.

  public List<Task> listTasksByAssignee(String assignee) {     // Метод, который возвращает список задач, назначенных указанному разработчику.
    String title;
    for (int i = 0; i < developerList.size(); i++){
    String devtitle;
      if ()
    }
//    for (Developer name : developerList) {
//      String devName = developerList.get();
//      if (name.equals(devName)) {
//      }
//    }

    return title;
  }

  public Map<String, Integer> countTasksByStatus() {          // Метод, который возвращает отображение(Map) со статусами задач и количеством задач в каждом статусе.


  }

  public void createTask(Task task) {                         // Метод, который создает новую задачу и добавляет ее в список задач.


  }

  public void assignTask(Developer developer, Task task) {     // Метод, который назначает задачу разработчику.


  }

  public void updateTaskStatus(Task task, String newStatus) {     // Метод, который обновляет статус задачи.


  }

  public void updateTaskDeadline(Task task, Date newDeadline) {     // Метод, который обновляет крайний срок выполнения задачи.


  }

}
