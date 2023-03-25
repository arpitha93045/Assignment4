package com.javatechie.spring.orm.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@Entity
public class Person {
  
  @Id
  @GeneratedValue
  private int id;
  private String name;
  @JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="dd/mm/yyyy")
   private Date dob;

}
