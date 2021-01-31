package com.example.demo;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Public {

    private String abc;

    @Builder
    public Public(String abc){
        this.abc=abc;
    }

}
