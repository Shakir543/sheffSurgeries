package com.sshabbir

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
String nursePhone
Surgery surgery


String  toString(){
return nurseName
}
static hasMany=[doctors:Doctor]
static belongsTo=[Doctor]


    static constraints = {
nurseName nullable: false, blank: false
qualifications nullable: false, blank: false
nurseEmail nullable: false, blank: false, email: true
nurseOffice nullable: false, blank: false
nursePhone nullable: false, blank: false
surgery nullable: false, blank: false

    }
}
