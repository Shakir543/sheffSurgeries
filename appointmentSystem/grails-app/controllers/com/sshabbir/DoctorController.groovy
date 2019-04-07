package com.sshabbir

class DoctorController {

    def scaffold= Doctor

def login() {
 }
def validate() {
def user = Doctor.findByDoctorEmail(params.email)
if (user && user.password == params.password){
session.user = user
render view:'home'
}
else{
flash.message = "Invalid email and password."
render view:'login'
}
}
def logout = {
 session.user = null
 redirect(uri:'/')
 }

}
