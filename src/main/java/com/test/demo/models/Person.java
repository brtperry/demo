package com.test.demo.models;

import com.test.demo.constraints.NumberConstraint;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import java.util.Locale;

public class Person {

    @NotNull
    //@Min(value = 18)
    //@Max(value = 80)
    //@Min(value = 1, message = "Must be a whole number greater than 1")
    //@Convert(StringHoursToIntegerConverter.class)
    //@NumberFormat(style = NumberFormat.Style.NUMBER)
    //@HoursWorkedConstraint
    @NumberConstraint
    private Integer age;

    @NotNull
    //@Size(min = 2, max = 30)
    @Value("Ngu")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Person named $s aged $d", name, age);
    }
}
