package com.lefoot.lefootbackend.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CSV_upload_data")
public class CSVUploadData {
  public CSVUploadData() {

  }

  public CSVUploadData(
    String name,
    Integer age,
    String cpf,
    Date birthdate,
    String gender,
    String email,
    String cep,
    String address,
    Integer number,
    String neighborhood,
    String city,
    String state
  ) {
    this.name = name;
    this.age = age;
    this.cpf = cpf;
    this.birthdate = birthdate;
    this.gender = gender;
    this.email = email;
    this.cep = cep;
    this.address = address;
    this.number = number;
    this.neighborhood = neighborhood;
    this.city = city;
    this.state = state;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column(name = "name", nullable = false)
  private String name;
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }

  @Column(name = "age", nullable = false)
  private Integer age;
  public Integer getAge() {
      return age;
  }
  public void setAge(Integer age) {
      this.age = age;
  }

  @Column(name = "cpf", nullable = false)
  private String cpf;
  public String getCpf() {
      return cpf;
  }
  public void setCpf(String cpf) {
      this.cpf = cpf;
  }

  @Column(name = "birthdate", nullable = false)
  private Date birthdate;
  public Date getBirthdate() {
      return birthdate;
  }
  public void setBirthdate(Date birthdate) {
      this.birthdate = birthdate;
  }

  @Column(name = "gender", nullable = false)
  private String gender;
  public String getGender() {
      return gender;
  }
  public void setGender(String gender) {
      this.gender = gender;
  }

  @Column(name = "email", nullable = false)
  private String email;
  public String getEmail() {
      return email;
  }
  public void setEmail(String email) {
      this.email = email;
  }

  @Column(name = "cep", nullable = false)
  private String cep;
  public String getCep() {
      return cep;
  }
  public void setCep(String cep) {
      this.cep = cep;
  }

  @Column(name = "address", nullable = false)
  private String address;
  public String getAddress() {
      return address;
  }
  public void setAddress(String address) {
      this.address = address;
  }

  @Column(name = "number", nullable = false)
  private Integer number;
  public Integer getNumber() {
      return number;
  }
  public void setNumber(Integer number) {
      this.number = number;
  }

  @Column(name = "neighborhood", nullable = false)
  private String neighborhood;
  public String getNeighborhood() {
      return neighborhood;
  }
  public void setNeighborhood(String neighborhood) {
      this.neighborhood = neighborhood;
  }

  @Column(name = "city", nullable = false)
  private String city;
  public String getCity() {
      return city;
  }
  public void setCity(String city) {
      this.city = city;
  }

  @Column(name = "state", nullable = false)
  private String state;
  public String getState() {
      return state;
  }
  public void setState(String state) {
      this.state = state;
  }
}
