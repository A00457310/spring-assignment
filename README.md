# spring-assignment
H2 database is used for all Persistence operations.
Lombok library is used for abstracting boiler plate code.
Below two apis are developed :
1) GET localhost:8080/api/hotel  -> To get list of hotels

curl --location --request GET 'localhost:8080/api/hotel' \
--data-raw ''


2) POST localhost:8080/api/hotel  -> To create hotel


curl --location --request GET 'localhost:8080/api/hotel' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 5,
    "name": "Oyo 123",
    "address": "2237 brunswick street",
    "noOfRooms": 111,
    "rating": "3.5"
}'
