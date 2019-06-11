// "DuckImplementation.cpp"
// Implementation code for Duck parent class and all Duck family classes (classes that derive from Duck) contained in `Duck.h`
#include <iostream>
#include "Duck.h"

// class -> Duck
// method -> perform_quack()
void Duck::perform_quack() {
    quack_behavior->quack();
}

// class -> Duck
// method -> perform_quack()
void Duck::perform_fly() {
    fly_behavior->fly();
}

// class -> Duck
// method -> perform_quack()
void Duck::swim() {
    std::cout << "Add ducks float, even Decoys." << std::endl;
}

// class -> Duck 
// method -> set_quack_behavior()
void Duck::set_quack_behavior(QuackBehavior* quack_behavior) {
    this->quack_behavior = quack_behavior;
}

// class -> Duck 
// method -> set_fly_behavior()
void Duck::set_fly_behavior(FlyBehavior* fly_behavior) {
    this->fly_behavior = fly_behavior;
}

// class -> MallardDuck
// Constructor
MallardDuck::MallardDuck() {
    quack_behavior = new Quack();
    fly_behavior = new FlyWithWings();
}

// class -> MallardDuck
// method -> display()
void MallardDuck::display() {
    std::cout << "Hey!! It's a Mallard Duck." << std::endl;
}

// class -> RubberDuck
// Constructor
RubberDuck::RubberDuck() {
    quack_behavior = new Squeak();
    fly_behavior = new FlyNoWay();
}

// class -> RubberDuck
// method -> display()
void RubberDuck::display() { 
    std::cout << "Hey!! It's a Rubber Duck." << std::endl;
}

// class -> DecoyDuck
// Constructor
DecoyDuck::DecoyDuck() {
    quack_behavior = new SilentQuack();
    fly_behavior = new FlyNoWay();
}

// class -> DecoyDuck
// method -> display()
void DecoyDuck::display() {
    std::cout << "Hey!! It's a Decoy Duck." << std::endl;
}

// class -> RedHeadDuck
// Constructor
RedHeadDuck::RedHeadDuck() {
    quack_behavior = new Quack();
    fly_behavior = new FlyWithWings();
}

// class -> RedHeadDuck
// method -> display()
void RedHeadDuck::display() {
    std::cout << "Hey!! It's a Red Headed Duck." << std::endl;
}