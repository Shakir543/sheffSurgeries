package com.sshabbir

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone
Surgery surgery

String toString(){
return patientName
}

static hasMany=[prescriptions:Prescription,doctors:Doctor,appointments:Appointment]
static belongsTo=[Doctor,Prescription,Appointment]




    static constraints = {
patientName nullable: false, blank: false
patientAddress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientDob nullable: false, blank: false
patientID nullable: false, blank: false, unique: true, maxSize: 8
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false
surgery nullable: false, blank: false
    }
}
