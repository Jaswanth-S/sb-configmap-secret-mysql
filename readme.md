--post api 

http://minikube-ip/api/v1/create

body - 

{	
	"email" : "jaswanth@gmail.com",
	"password":"demo",
	"age":22	
}


--- get

http://minikube-ip/api/v1/getAll


--- update

http://minikube-ip/api/v1/update

body -

{
	"email":"jaswanth@gmail.com",
	"name":"jaswanth sai",
	"password":"jas123",
	"age":22
}
