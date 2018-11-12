#ifndef CALC_H
#define CALC_H

#include <QObject>

class Calc : public QObject
{
    Q_OBJECT
public:
    explicit Calc(QObject *parent = nullptr);

    float addition(float, float);
    float subtraction(float, float);
    float multiplication(float, float);
    float division(float, float);

signals:

public slots:
};

#endif // CALC_H
