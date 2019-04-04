package com.sshabbir

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword
String recepPhone

    static constraints = {
recepName nullable: false, blank: false
recepEmail nullable: false, blank: false, email: true
recepUsername nullable: false, blank: false, unique: true, maxSize: 15
recepPassword nullable: false, blank: false, password: true, unique: true, minSize: 8, maxSize:16
recepPhone nullable: false, blank: false
    }
}
