package com.sshabbir

class Appointment {
Date appDate
String time
int appDuration
String roomNumber


    static constraints = {
appDate nullable: false, blank: false
time nullable: false, blank: false
appDuration nullable: false, blank: false
roomNumber nullable: false, blank: false
    }
}
