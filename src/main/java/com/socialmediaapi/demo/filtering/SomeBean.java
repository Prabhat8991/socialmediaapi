package com.socialmediaapi.demo.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record SomeBean(String field1, @JsonIgnore String field2, String field3) {
}
