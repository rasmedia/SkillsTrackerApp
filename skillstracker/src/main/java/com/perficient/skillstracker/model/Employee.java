package com.perficient.skillstracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "street")
	private String street;

	@Column(name = "suite")
	private String suite;

	@Column(name = "city")
	private String city;

	@Column(name = "region")
	private String region;
	@Column(name = "postal")
	private String postal;

	@Column(name = "country")
	private String country;

	@Column(name = "contact_email", nullable = false, length = 200)
	private String contactEmail;

	@Column(name = "company_email", nullable = false, length = 200)
	private String companyEmail;

	@Column(name = "birth_date", nullable = false, length = 200)
	private String birthDate;

	@Column(name = "hire_date", nullable = false, length = 200)
	private String hireDate;

	@Column(name = "role", nullable = false, length = 200)
	private String role;

	@Column(name = "business_unit", nullable = false, length = 200)
	private String businessUnit;

	@Column(name = "field_name", nullable = false, length = 200)
	private String fieldName;

	@Column(name = "field_type", nullable = false, length = 200)
	private String fieldType;

	@Column(name = "experience", nullable = false, length = 200)
	private int experience;

	@Column(name = "summary", nullable = false, length = 200)
	private String summary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", street=" + street
				+ ", suite=" + suite + ", city=" + city + ", region=" + region + ", postal=" + postal + ", country="
				+ country + ", contactEmail=" + contactEmail + ", companyEmail=" + companyEmail + ", birthDate="
				+ birthDate + ", hireDate=" + hireDate + ", role=" + role + ", businessUnit=" + businessUnit
				+ ", fieldName=" + fieldName + ", fieldType=" + fieldType + ", experience=" + experience + ", summary="
				+ summary + "]";
	}
}
