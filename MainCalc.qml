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
        }
        width: parent.width / 2
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
        }
        height: number1.height
        font.pointSize: height / 2
    }

}
