#include "backend.h"

Backend::Backend(QObject *parent) : QObject(parent)
{

}

void Backend::calculation(float n1, float n2, QString op)
{
    if (op == "+")
        emit signalQmlAnswer(m_calc.addition (n1, n2));
    else if (op == "-")
        emit signalQmlAnswer(m_calc.subtraction(n1, n2));
    else if (op == "*")
        emit signalQmlAnswer(m_calc.multiplication(n1, n2));
    else if (op == "/")
        emit signalQmlAnswer(m_calc.division(n1, n2));
}
