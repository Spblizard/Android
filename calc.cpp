#include "calc.h"

Calc::Calc(QObject *parent) : QObject(parent)
{

}

float Calc::addition(float n1, float n2)
{
    float answ = n1 + n2;
    return answ;
}

float Calc::subtraction(float n1, float n2)
{
    float answ = n1 - n2;
    return answ;
}

float Calc::multiplication(float n1, float n2)
{
    float answ = n1 * n2;
    return answ;
}

float Calc::division(float n1, float n2)
{
    float answ = n1 / n2;
    return answ;
}
