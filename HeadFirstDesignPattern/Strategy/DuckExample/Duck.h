#pragma once 
#include "FlyBehavior.h"
#include "QuackBehavior.h"

// Every duck has a fly behavior and quack behavior
// Fly behavior: Flying high, Doesn't fly, Flying with the rocket
// Quack behavior: Quack, Squeak, Silent
 class Duck {
     protected:
     FlyBehavior *fly_behavior;
     QuackBehavior *quack_behavior;
     public:
     void perform_quack();
     void perform_fly(); 
     virtual void display()=0;
     void swim();
     void set_quack_behavior(QuackBehavior* quack_behavior);
     void set_fly_behavior(FlyBehavior* fly_behavior);
};

// Mallard Duck quacks and flies high
class MallardDuck: public Duck {
    public:
    MallardDuck();
    MallardDuck(const FlyBehavior *fly_behavior, const QuackBehavior *quack_behavior);
    void display();
};


// Rubber Duck squeaks and doesn't fly
class RubberDuck: public Duck {
    public:
    RubberDuck();
    RubberDuck(const FlyBehavior *fly_behavior, const QuackBehavior *quack_behavior);
    void display();
};

// Decoy Duck doesn't quack and doesn't fly
class DecoyDuck: public Duck {
    public:
    DecoyDuck();
    DecoyDuck(const FlyBehavior *fly_behavior, const QuackBehavior *quack_behavior);
    void display();
};


// Red-head Duck quacks and flies high
class RedHeadDuck: public Duck {
    public:
    RedHeadDuck();
    RedHeadDuck(const FlyBehavior *fly_behavior, const QuackBehavior *quack_behavior);
    void display();
};