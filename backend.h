#ifndef BACKEND_H
#define BACKEND_H

#include <QObject>
#include "calc.h"

class Backend : public QObject
{
    Q_OBJECT
public:
    explicit Backend(QObject *parent = nullptr);

signals:
    void signalQmlAnswer(float answ);

public slots:
    void calculation(float, float, QString);

private:
    Calc m_calc;
};

#endif // BACKEND_H
