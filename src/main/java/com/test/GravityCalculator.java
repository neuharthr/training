package com.test;

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;


        //Compute the position of a falling object:
        //   x(t) = 0.5 * (at)^2 + v(t) + x
        //
        //  a = acceleration = -9.81 m/s
        //  t = falling time (in seconds)
        //  v = initial velocity
        //  x = initial position

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
} 