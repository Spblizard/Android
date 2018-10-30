#ifndef CALC_H
#define CALC_H

#include <QObject>

class Calc : public QObject
{
    Q_OBJECT
public:
    explicit Calc(QObject *parent = nullptr);

signals:

public slots:
};

#endif // CALC_H