package org.example._23_09_27;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {

  private int taskId;                 // Уникальный идентификатор задачи.
  private String taskTitle;           // Название задачи.
  private  String taskDescription;    // Описание задачи.
  private String taskAssignee;        // Имя назначенного исполнителя задачи.
  private char taskStatus;            // Статус задачи (новая, в работе, завершена).
  private double taskDeadline;        // Крайний срок выполнения задачи.

}