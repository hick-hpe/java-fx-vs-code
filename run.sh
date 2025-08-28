#!/bin/bash

ARQUIVO_ZIP="lib.zip"

# descompactar
if ls | grep -q $ARQUIVO_ZIP; then
    echo "Descompactando..."
    unzip $ARQUIVO_ZIP
    rm $ARQUIVO_ZIP
fi

# compilar    
javac --module-path lib --add-modules javafx.controls -d out src/$1.java

# executar
java --module-path lib --add-modules javafx.controls -cp out $1

# NOTA: $1 refere-se a posição do argumento
# Quando executa "bash run.sh MINHA_CLASSE", $1 = MINHA_CLASSE