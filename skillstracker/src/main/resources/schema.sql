DROP TABLE IF EXISTS TBL_EMPLOYEES;
 
CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

/**
CREATE TABLE IF NOT EXISTS TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);

**/
/**
DROP TABLE IF EXISTS TBL_EMPLOYEES;
 
CREATE TABLE TBL_EMPLOYEES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  street VARCHAR(250) NOT NULL,
  suite VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  region VARCHAR(250) NOT NULL,
  postal VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  contact_email VARCHAR(250) NOT NULL,
  company_email VARCHAR(250) NOT NULL,
  birth_date VARCHAR(250) NOT NULL,
  hire_date VARCHAR(250) NOT NULL,
  role VARCHAR(250) NOT NULL,
  business_unit VARCHAR(250) NOT NULL,
  field_name VARCHAR(250) NOT NULL,
  field_type VARCHAR(250) NOT NULL,
  experience int  NOT NULL,
  summary VARCHAR(250) DEFAULT NULL
);

**/