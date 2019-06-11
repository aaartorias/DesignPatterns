#include <iostream>
#include "FlyBehavior.h"


void FlyWithWings::fly() {
    std::cout << "Flying High." << std::endl;
}

void FlyNoWay::fly() {
    std::cout << "Can't fly." << std::endl;
}

void FlyRocketPowered::fly() {
    std::cout << "Flying with a Rocket." << std::endl;
}