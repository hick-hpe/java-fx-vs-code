#!/bin/bash

# Caminhos
SRC_DIR="src"
OUT_DIR="out"
MAIN_CLASS="Main"
JAVAFX_PATH="/home/aluno/javafx-sdk-21.0.5/lib"

# Cria pasta de saída se não existir
mkdir -p "$OUT_DIR"

# Compilar
echo "Compilando..."
javac --module-path "$JAVAFX_PATH" --add-modules javafx.controls -d "$OUT_DIR" "$SRC_DIR/$MAIN_CLASS.java"

# Verifica se compilação teve sucesso
if [ $? -ne 0 ]; then
    echo "❌ Erro na compilação."
    exit 1
fi

# Executar
echo "Executando..."
java --module-path "$JAVAFX_PATH" --add-modules javafx.controls -cp "$OUT_DIR" "$MAIN_CLASS"

