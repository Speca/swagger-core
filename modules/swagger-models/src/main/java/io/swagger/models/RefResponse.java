package io.swagger.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RefResponse extends Response{

    String ref;

    public RefResponse(String ref) {
        set$ref(ref);
    }

    public RefResponse asDefault(String ref) {
        this.set$ref("#/responses/" + ref);
        return this;
    }
    public String get$ref() {
        return "#/responses/" + ref;
    }
    public void set$ref(String ref) {
        if(ref.indexOf("#/responses/") == 0)
            this.ref = ref.substring("#/responses/".length());
        else
            this.ref = ref;
    }

    @JsonIgnore
    public String getSimpleRef() {
        if(ref.indexOf("#/responses/") == 0)
            return ref.substring("#/responses/".length());
        else
            return ref;
    }


}