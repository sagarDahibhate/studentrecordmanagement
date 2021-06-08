package com.inn.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
   private Integer rollno;
   private String studentName;
   private String schoolName;
   private int standard;
   
}
