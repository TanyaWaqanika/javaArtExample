package com.qa;

// INTERFACES (contract)
// Another way to have abstraction in Java is by using Interfaces
// Java is single INHERITANCE, i.e. every child class can inherit methods and attributes from 1 parent class (top - down inheritance)
// Interfaces are abstract classes that can allow classes to have multiple 'is a kind of' relationships between them.
// This is especially useful for subclasses/child classes derived from different superclasses/parent classes, that may have a similar trait between them
// Interface methods have empty bodies, as the classes that implement them will provide their own.

interface Music {
    void playSong();
}
