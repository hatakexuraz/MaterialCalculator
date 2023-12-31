package com.example.materialcalculator.domain

enum class Operation(val symbol: Char) {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    PERCENT('%'),
}

val operationSymbols = Operation.values().map{ it.symbol }.joinToString("")         //it will return Operation enum values joined together {+-*/%}

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find { it.symbol==symbol }
        ?: throw IllegalArgumentException("Invalid Symbol")
}