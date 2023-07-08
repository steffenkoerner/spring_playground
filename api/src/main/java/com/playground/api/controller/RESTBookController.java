package com.playground.api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class RESTController {


//    @GetMapping("/book/{id}")
//    public Book bookById(@PathVariable(required = true) String id) {
//        return Book.getById(id);
//    }
//


    @GetMapping("/hello")
    public ResponseTransfer SayHello(){
        return new ResponseTransfer("Hello");
    }

    @GetMapping("/hello/{name}")
    public ResponseTransfer SayHelloWithName(@PathVariable(required = true) String name){
        return new ResponseTransfer("Hello " + name);
    }

    @PostMapping
    public ResponseTransfer SayHelloWith() {
        return new ResponseTransfer ("");
    }

    // TODO: Send json object with error code back instead of html page
    // Implement some post/put/delete rest handler

    public class ResponseTransfer {
        private String text;

        ResponseTransfer(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }


    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
    public class DogNotFoundException extends RuntimeException {

        public DogNotFoundException() {
        }

        public DogNotFoundException(String message) {
            super(message);
        }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class BadRequestException extends RuntimeException {
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {
    }
}
