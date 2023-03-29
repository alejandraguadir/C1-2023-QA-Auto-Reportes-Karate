package com.sofkau;

import com.intuit.karate.junit5.Karate;

public class Runnner {
    @Karate.Test
    Karate testSample(){
        return Karate.run("src/test/java/features");
    }
}
