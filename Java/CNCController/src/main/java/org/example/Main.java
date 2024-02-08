package org.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CNCController {

  @PostMapping("/generate-gcode")
  public String generateGCode(@RequestBody CNCRequest cncRequest) {
    // Реализуйте логику генерации G-кода здесь
    return generateGCodeFromRequest(cncRequest);
  }

  private String generateGCodeFromRequest(CNCRequest cncRequest) {
    // Реализуйте вашу логику для генерации G-кода
    // Вернем заглушку для примера
    return "G00 Z0.5\nG00 X0 Y0\nG01 Z-0.1 F30.0\nG01 X1 Y0\nG01 X1 Y1\nG01 X0 Y1\nG01 X0 Y0\nG00 Z0.5";
  }
}
