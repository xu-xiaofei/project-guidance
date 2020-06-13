# graphql-with-spring-boot
A sample application with GraphQL and Spring Boot

## hot to start

#### Start with internal address in explore

1. run application 
2. open address  [交互查询地址](http://localhost:8080/graphiql)

Query condition
```
{
  vehicles(count: 1) {
    type
    modelCode
  }
}
```
Result:
```
{
    "data": {
        "vehicle": {
            "id": 0,
            "type": "type",
            "modelCode": "modelCode"
        }
    }
}
```

#### Or you can use post man to search used like follow:
1. run application 
2. Use the __Post__ way to get info,filling the address with [前端查询地址](http://localhost:8080/graphql)
3. input 
```
{
  vehicles(count: 1) {
    type
    modelCode
  }
}
```
in body -> graphql content

4. send and fetch the result
```
{
    "data": {
        "vehicle": {
            "id": 0,
            "type": "type",
            "modelCode": "modelCode"
        }
    }
}
```
