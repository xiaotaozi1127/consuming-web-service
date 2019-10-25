# consuming-web-service
Reference: https://spring.io/guides/gs/consuming-web-service/

This is a client that fetches country data data from a remote, WSDL-based web service using SOAP.

## generate classes for the WSDL found at the specified URL
`$ ./mvnw jaxb2:generate`

generated class will be found in 
`target/generated-sources/xjc/hello.wsdl` package

## run target web service first
go to producing-web-service and start it in local. verify it is working by visiting http://localhost:8080/ws/countries.wsdl in your browser

