# codegen-formatter-checkstyle-demo
Project Demo to show code generation with swagger codegen and formating and checkin style of generated code 
This project were initiated by scaffolding from Ritchie CLI <https://ritchiecli.io/>

After cloging the repository, run the maven command at project root folder:

```# mvn clean compile```

The goals that is intended to achieve is:


- First

The plugin `swagger-codegen-zup-plugin`  
Will generate the API Client code based on Spring 2.3.0 and OpenFeign using the Design First Concept from the YAML 
```src/main/resources/api-design/languages.yaml```

So, will be created a couple of java classes like APIClient and the Data Objects (DTOs) described at API.


- Second

The Plugin `formatter-maven-plugin` will format all the java source code as the file (eclipse based) config/zup-eclipse_codestyle_formatter.xml
describes the code format shall be.


- Final 

The Plugin `maven-checkstyle-plugin` will validate if all the code generated and formmated is commited with the 
rules of styling defined at file `config/zup_checkstyle.xml` 








 