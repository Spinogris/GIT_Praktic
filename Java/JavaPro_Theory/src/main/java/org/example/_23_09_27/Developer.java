package org.example._23_09_27;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Developer {

  private int developerId;                             // Уникальный идентификатор разработчика.
  private String developerName;                        // Имя разработчика.
  private String developerEmail;                       // Электронная почта разработчика.
  private String developerTeam;                        // Название команды, к которой принадлежит разработчик.
  private List<Task> developerTasks;                   // Список задач, назначенных разработчику.
  private Map<String, Integer> developerTaskCount;     // Количество задач по статусам.

  public Developer(int developerId,
                   String developerName,
                   String developerEmail,
                   String developerTeam,
                   List<Task> developerTasks,
                   Map<String, Integer> developerTaskCount) {
    this.developerId = developerId;
    this.developerName = developerName;
    this.developerEmail = developerEmail;
    this.developerTeam = developerTeam;
    this.developerTasks = developerTasks;
    this.developerTaskCount = developerTaskCount;
  }
}