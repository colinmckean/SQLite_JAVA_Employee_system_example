DROP TABLE employees;
DROP TABLE departments;
DROP TABLE descriptions;

CREATE TABLE departments(
    ID INTEGER primary key AUTOINCREMENT,
    title VARCHAR(50)
);

CREATE TABLE employees (
  ID INTEGER PRIMARY KEY AUTOINCREMENT,
  name VARCHAR(50),
  salary REAL,
  department_id INTEGER references departments(id),
  description_id INTEGER references descriptions(id)
);

CREATE TABLE descriptions (
  ID INTEGER primary key AUTOINCREMENT,
  description VARCHAR(50)
);