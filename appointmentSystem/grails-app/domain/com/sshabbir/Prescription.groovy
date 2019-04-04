package com.sshabbir

class Prescription {
String pharmacyName
String prescripNumber
String medicine
Double totalCost
Date dateIssued
Boolean  patientPaying
String daysOfsupply

    static constraints = {
pharmacyName nullable: false, blank: false
prescripNumber nullable: false, blank: false, unique: true, maxSize: 20
medicine nullable: false, blank: false
totalCost nullable: false, blank: false
dateIssued nullable: false, blank: false
patientPaying nullable: false, blank: false 
daysOfsupply nullable: false, blank: false 
    }
}
