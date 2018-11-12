import QtQuick 2.9
import QtQuick.Controls 2.2

ApplicationWindow {
    visible: true
    width: 720 / 2
    height: 1280 / 2
    title: qsTr("Adroid-calc")

    SwipeView {
        id: swipeView
        anchors.fill: parent
        currentIndex: tabBar.currentIndex

        property int mainWidth: parent.width
        property int mainHeight: parent.height

        MainCalc {
        }

        StringCalc {
        }
    }

    footer: TabBar {
        id: tabBar
        currentIndex: swipeView.currentIndex

        TabButton {
            text: qsTr("Main")
        }
        TabButton {
            text: qsTr("String")
        }
    }
}
