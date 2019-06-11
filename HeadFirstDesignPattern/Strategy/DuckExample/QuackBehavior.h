#pragma once

class QuackBehavior {
    public:
    virtual void quack()=0;
};

class Quack: public QuackBehavior {
    public:
    void quack();
};

class Squeak: public QuackBehavior {
    public:
    void quack();
};

class SilentQuack: public QuackBehavior {
    public:
    void quack();
};