# REST AND GraphQL

This is a short overview of REST and GraphQL Endpoints. Most people are already familiar with REST as it is at the 
moment the most commonly used endpoint. A less known one is GraphQL. 

GraphQL is a query language for endpoints and a runtime to serve this queries. The cool thing is that in the query
you can express exactly what information you want to have. This prevents over- or underfetching that happens
regulary with rest. As a result in GraphQL you often just need one request instead of multiple ones in REST.

In REST you query an edpoint and you get back


Extensive information about GraphQL can be found here: https://graphql.org/


REST is one of the most known and used endpoints.

I created a postman collection with some example queries that you can execute. The collection can be found in 
the resources: spring_playground/api/src/main/resources/RESTandGraphQLQueries.postman_collection.json

Tell a bit about the story how rest endpoints have problems
you need endpoints for return types that are specified. Can end up with many small endpoints or you fetch
to match data. Multiple calls necessary.

It would be nice if the user can specify which data he wants to get. Exactly, this is what GraphQL is about.
Let's have a closer look at this fascinating technology.

## REST

### How to use the REST Endpoints



## GraphQL
More information on GraphQL can be found here: https://graphql.org/


Another great thing is that you can list the 

You can check all available Queries and Schemas with graphiql. You can check it out after starting the spring application
by going to http://www.localhost:8080/graphiql

### How to use the GraphQL Endpoints

