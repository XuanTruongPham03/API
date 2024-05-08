# API: https://api-ma4g.onrender.com/api/v1/students

## POST DATA
### Create a new student
Send an HTTP POST request to the endpoint https://api-ma4g.onrender.com/api/v1/students with the parameters `id` (Student ID), `name` (Student name), `year` (Academic year) in the body of the request.
</br>For example:
```shell
{
    "id": "20242024",
    "name": "Student Name",
    "year": "2024"
}
```
In case the student already exists, the system will return an error message:
```shell
Student already exists
```
Otherwise, it will be saved to the database and return the message:
```shell
Student created: 
Student(id=20242024, name=Student Name, year=2024)
```

## GET DATA
### Search for students in the database by student ID
Send an HTTP GET request to the endpoint https://api-ma4g.onrender.com/api/v1/students/search/{id}, with {id} as the ID of the student you want to retrieve information for.
</br>Example: GET https://api-ma4g.onrender.com/api/v1/students/search/20242024
```shell
// https://api-ma4g.onrender.com/api/v1/students/search/20242024

{
  "id": 20242024,
  "name": "Student Name",
  "year": 2024
}
```
### Search for students in the database by name
Send an HTTP GET request to the endpoint https://api-ma4g.onrender.com/api/v1/students/search, and provide the query parameter `name` in the URL. It will return a list of students with corresponding names.
</br>Example: GET [https://api-ma4g.onrender.com/api/v1/students/search?name=Phạm Xuân Trường](https://api-ma4g.onrender.com/api/v1/students/search?name=Ph%E1%BA%A1m%20Xu%C3%A2n%20Tr%C6%B0%E1%BB%9Dng)
```shell
// https://api-ma4g.onrender.com/api/v1/students/search?name=Phạm%20Xuân%20Trường

[
  {
    "id": 20002000,
    "name": "Phạm Xuân Trường",
    "year": 2024
  },
  {
    "id": 20001999,
    "name": "Phạm Xuân Trường",
    "year": 2023
  }
]
```
In case no name is provided, it will display all the existing students in the database.
