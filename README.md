# Request Body Bug

This Maven module demonstrates what appears to be a bug with SpringFox 2.8.0.

Run the following command to start the example:
```
./mvnw spring-boot:run
```

Point your browser to http://localhost:8080/swagger-ui.html and you'll
receive the following error:

> Resolver error at paths./example.put.parameters.0.schema.$ref
>
> Could not resolve reference because of: Could not resolve pointer: /definitions/String does not exist in document
 
Change `springfox.version` in pom.xml to `2.7.0` and this example runs without error. *Note:* you may need to
hard-refresh the browser to pick up the changes.
