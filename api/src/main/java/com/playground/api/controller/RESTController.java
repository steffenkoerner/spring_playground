package com.playground.api.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RESTController {

    /**
     * This function handles calls to /api and /api/{name}. Could also be done with a separate controller.
     * Then the if/else statements are not needed.
     */
    @GetMapping(value = { "/hello", "/hello/{name}" })
    public ResponseTransfer SayHelloWithName(@PathVariable(required = false) String name){

        if(name == null)
            return new ResponseTransfer("Hello");
        else
            return new ResponseTransfer("Hello " + name);
    }

    @GetMapping(value = "/content", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody

    public ResponseTransfer postResponseXmlContent() {
        return new ResponseTransfer("XML Content!");
    }

    @GetMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseTransfer postResponseJsonContent() {
        return new ResponseTransfer("JSON Content!");
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
