package com.sshabbir

class Surgery {
String name
String address
String postcode
String openingtime
String description
String telephone
int numberOfPatients

    static constraints = {
name nullable: false, blank: false
address nullable: false, blank: false
postcode nullable: false, blank: false
openingtime nullable: false, blank: false
description nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
telephone nullable: false, blank: false
numberOfPatients nullable: false, blank: false, max: 50
    }
}
