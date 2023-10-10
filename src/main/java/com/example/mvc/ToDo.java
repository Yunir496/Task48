package com.example.mvc;

import com.example.mvc.validation.CheckEmail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
    @Size(min=12,max=140,message = "Длина имени не соответствует")
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private Integer priority;
    //@Pattern(regexp = ".+@.+\\..+",message = "Неверный формат email")
    @CheckEmail(value = "qwerty", message = "message")
    private String email;

}
