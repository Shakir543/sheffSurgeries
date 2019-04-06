package com.sshabbir

class Doctor {
String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
String phone
String bio




String toString(){
return fullName
}

static hasMany=[prescriptions:Prescription,appointments:Appointment,patients:Patient,nurses:Nurse,surgeries:Surgery]
static belongsTo=[Patient,Nurse,Prescription,Surgery,Appointment]



    static constraints = {
fullName nullable: false, blank: false
qualification nullable: false, blank: false
position nullable: false, blank: false
doctorEmail nullable: false, blank: false, email: true
password nullable: false, blank: false, password: true, unique: true, minSize: 8, maxSize:16
doctorOffice nullable: false, blank: false
phone nullable: false, blank: false
bio nullable: false, blank: false, maxSize: 5000, widget: 'textarea'

    }
}
