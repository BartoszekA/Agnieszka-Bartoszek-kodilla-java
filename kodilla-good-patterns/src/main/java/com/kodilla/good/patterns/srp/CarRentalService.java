//package com.kodilla.good.patterns.srp;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class CarRentalService {
//
//    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
//
//        System.out.println("Renting Car fot: " + user.getName() + user.getSurname()
//        + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());
//
//        MailService mailService = new MailService();
//        mailService.sendEmail(user);
//
//        CarRentalRespository carRentalRepository = new CarRentalRepository();
//        carRentalRepository.createCarRental(user, carRentFrom, carRentTo);
//
//        return true;
//    }
//}
