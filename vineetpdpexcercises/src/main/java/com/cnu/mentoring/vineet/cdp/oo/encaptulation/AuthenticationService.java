package com.cnu.mentoring.vineet.cdp.oo.encaptulation;

public class AuthenticationService {
    public static boolean isValidUser(Employee employee) {
        if (employee.getEmployeeName().equals("Srinivas")) {
            return true;
        }
        return false;
    }
}
