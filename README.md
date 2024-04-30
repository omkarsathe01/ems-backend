# Employee Management System

This is a simple Employee Management System API that allows you to perform CRUD operations on employees.

## Endpoints

### Create a new employee

Create a new employee by sending a POST request to `/api/employees`.

```
POST http://{url}/api/employees
Content-Type: application/json

{
  "firstName": "Name",
  "lastName": "Name",
  "email": "name@email.com"
}
```

### Get an employee by ID

Retrieve employee details by sending a GET request to `/api/employees/{id}`.

```
GET http://{url}/api/employees/{id}
Content-Type: application/json
```

### Get all employees

Retrieve all employees by sending a GET request to `/api/employees`.

```
GET http://{url}/api/employees
Content-Type: application/json
```

### Update an employee

Update an existing employee by sending a PUT request to `/api/employees/{id}`.

```
PUT http://{url}/api/employees/{id}
Content-Type: application/json

{
  "firstName": "Name",
  "lastName": "Name",
  "email": "name@email.com"
}
```

### Delete an employee by ID

Delete an employee by sending a DELETE request to `/api/employees/{id}`.

```
DELETE http://{url}/api/employees/{id}
Content-Type: application/json
```

## Note

- Replace {url} in the URL with the actual URL on which the ems-backend server is running.
- Replace {id} in the URL with the actual ID of the employee you want to retrieve, update, or delete.

Feel free to contribute!