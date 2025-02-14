package edu.cmu.cs.cs214.lab02.shapes;

public sealed interface Shape permits Circle, Rectangle, Square {
    double getArea();
}