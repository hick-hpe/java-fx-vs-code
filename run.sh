#!/bin/bash

# compilar    
javac --module-path lib --add-modules javafx.controls -d out src/Main.java

# executar
java --module-path lib --add-modules javafx.controls -cp out Main
    