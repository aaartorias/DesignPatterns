#include <iostream>
#include "QuackBehavior.h"

void Quack::quack() {
    std::cout << "Quack Quack." << std::endl;
}

void Squeak::quack() {
    std::cout << "Squeak Squeak." << std::endl;
}

void SilentQuack::quack() {
    std::cout << ".............(Silent)" << std::endl;
}