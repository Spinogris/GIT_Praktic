package org.example._2023_09_25;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class ForTypes {

  String name;
  int age;
  boolean isWorker;
  char gender;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForTypes forTypes = (ForTypes) o;
    return age == forTypes.age
            && isWorker == forTypes.isWorker
            && gender == forTypes.gender
            && Objects.equals(name, forTypes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, isWorker, gender);
  }
}

