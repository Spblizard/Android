import QtQuick 2.0
import QtQuick.Controls 2.2

Item {
    id: root

    Label {
        id: labelNumber1
        anchors {
            left: number1.left
            bottom: number1.top
        }
        font.pointSize: number1.font.pointSize
        font.family: "Arial"
        text: "Number 1"
    }

    TextArea {
        id: number1
        anchors {
            top: parent.top
            topMargin: parent.height / 10
            left: parent.left
            leftMargin: height / 5
        }
        width: parent.width / 2.19
        height: parent.height / 11
        font.pointSize: height / 2
    }

    Label {
        id: labelNumber2
        anchors {
            left: number2.left
            bottom: number2.top
        }
        font.pointSize: number2.font.pointSize
        font.family: "Arial"
        text: "Number 2"
    }

    TextArea {
        id: number2
        anchors {
            top: number1.top
            left: number1.right
            leftMargin: number1.height / 5
            right: parent.right
            rightMargin: number1.height / 5
        }
        height: number1.height
        font.pointSize: height / 2
    }

    Button {
        id: buttonPlus
        anchors {
            top: number1.bottom
            left: number1.left
        }
        width: number1.width / 2.14
        height: number1.height
        text: "+"
        font.pointSize: number1.font.pointSize
    }

    Button {
        id: buttonMinus
        anchors {
            top: buttonPlus.top
            left: buttonPlus.right
            leftMargin: number1.height / 5
            right: number1.right
        }
        height: buttonPlus.height
        text: "-"
        font.pointSize: number1.font.pointSize
    }

     Button {
        id: buttonAdd
        anchors {
            top: number2.bottom
            left: number2.left
        }
        width: number2.width / 2.14
        height: number2.height
        text: "*"
        font.pointSize: number1.font.pointSize
    }

    Button {
        id: buttonDiv
        anchors {
            top: buttonAdd.top
            left: buttonAdd.right
            leftMargin: number2.height / 5
            right: number2.right
        }
        height: buttonPlus.height
        text: "/"
        font.pointSize: number1.font.pointSize
    }

}
