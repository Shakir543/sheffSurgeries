package com.sshabbir

class BootStrap {

    def init = { servletContext ->
 def SMCentre = new 
Surgery(
 name: 'Sheffield Medical Centre',
 address: '185 London Road, Sheffield',
 postcode: 'S2 4TH',
 openingtime: '09:00-5:00hrs',
 description: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant',
 telephone: '01274 934782',
 numberOfPatients: '42').save()

def RMSurgery = new 
Surgery(
name: 'Ridge Medical Centre',
address: '183 Ashmount Road, Bradford',
postcode: 'BD5 9ET',
openingtime: '08:00-6:00hrs',
description: '''Lorem ipsum delor sit atmet, hitai sake sauteed tantas ne. Te duo Putant''',
telephone: '01274 924482',
numberOfPatients: '48').save()


def SGomez = new
Receptionist(
recepName: 'Selena Gomez',
recepEmail: 'selena72@hotmail.com',
recepUsername: 'sgomez12',
recepPassword: 'selena34',
recepPhone: '0114 222 4445',
surgery: SMCentre).save()


def RKingston = new
Receptionist(
recepName: 'Rob Kingston',
recepEmail: 'rob72@hotmail.com',
recepUsername: 'rking12',
recepPassword: 'secret2098',
recepPhone: '0114 212 2435',
surgery: RMSurgery).save()


def BPitt = new
Doctor(
fullName: ' Dr Brad Pitt',
qualification: 'MBChB(London)',
position: 'GP, Surgeon',
doctorEmail: 'Brad73@hotmail.com',
password: 'brad1234',
doctorOffice: 'D-1452',
phone: '01274 625451',
bio: 'Lorem ipsum delor sit atmet, cum beege errpr tantas ne. Te duo Putant.').save()

def JFoxx = new
Doctor(
fullName: ' Dr Jamie Foxx',
qualification: 'MBChB(Sheffield)',
position: 'GP',
doctorEmail: 'Jamie12@hotmail.com',
password: 'jamie1234',
doctorOffice: 'D-1112',
phone: '01274 673451',
bio: 'Lorem ipsum delor sit atmet, cum sale errpr tantas ne. Te duo Putant.').save()

def TRivers = new
Patient(
patientName: 'Tom Rivers',
patientAddress: '105 Clough Road, Eckington',
patientResidence: 'Sheffield,Barnsley,Doncaster',
patientDob: new Date('20/09/1998'),
patientID: 'E25555',
dateRegistered: new Date('26/02/2018'),
patientPhone: '0114 222 4444').save()

def MJolie = new
Patient(
patientName: 'Matt Jolie',
patientAddress: '102 Spotted Road, Chesterfield',
patientResidence: 'Sheffield,Doncaster,Derbyshire',
patientDob: new Date('10/06/1995'),
patientID: 'L25155',
dateRegistered: new Date('23/01/2018'),
patientPhone: '0114 322 4424').save()


def SPeters = new
Nurse(
nurseName: 'Susan Peters', 
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@hotmail.com',
nurseOffice: 'B-455',
nursePhone: '0114 2224433').save()

def RHope = new
Nurse(
nurseName: 'Rebecca Hope', 
qualifications: 'Registered General Nurse',
nurseEmail: 'r.hope@hotmail.com',
nurseOffice: 'C-451',
nursePhone: '0114 2234433').save()

def App1 = new
Appointment(
appDate: new Date('22/10/2018'),
time: '3:00pm',
appDuration: '30',
roomNumber: 'A-1111').save()

def App2 = new
Appointment(
appDate: new Date('23/03/2019'),
time: '2:00pm',
appDuration: '60',
roomNumber: 'A-1611').save()

def PCTL = new 
Prescription(
pharmacyName: 'City Centre Pharmacy',
prescripNumber: '56788',
medicine: 'Paracetomol',
totalCost: 5.90,
dateIssued: new Date('25/05/2019'),
patientPaying: 'true',
daysOfsupply: '2 Weeks').save()

def IBN = new 
Prescription(
pharmacyName: 'City Centre Pharmacy',
prescripNumber: '62788',
medicine: 'Ibuprofen',
totalCost: 4.10,
dateIssued: new Date('21/03/2019'),
patientPaying: 'true',
daysOfsupply: '1 Week').save()











    
}
    def destroy = {
    }
}

